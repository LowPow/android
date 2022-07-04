package com.downloader.internal

import com.downloader.*
import com.downloader.database.DownloadModel
import com.downloader.handler.ProgressHandler
import com.downloader.httpclient.HttpClient
import com.downloader.internal.stream.FileDownloadOutputStream
import com.downloader.internal.stream.FileDownloadRandomAccessFile
import com.downloader.request.DownloadRequest
import com.downloader.utils.Utils
import java.io.*
import java.net.HttpURLConnection

class DownloadTask private constructor(private val request: DownloadRequest) {
    private var progressHandler: ProgressHandler? = null
    private var lastSyncTime: Long = 0
    private var lastSyncBytes: Long = 0
    private var inputStream: InputStream? = null
    private var outputStream: FileDownloadOutputStream? = null
    private var httpClient: HttpClient? = null
    private var totalBytes: Long = 0
    private var responseCode = 0
    private var eTag: String? = null
    private var isResumeSupported = false
    private var tempPath: String? = null
    fun run(): Response {
        val response = Response()
        if (request.status == Status.CANCELLED) {
            response.isCancelled = true
            return response
        } else if (request.status == Status.PAUSED) {
            response.isPaused = true
            return response
        }
        try {
            if (request.onProgressListener != null) {
                progressHandler = ProgressHandler(request.onProgressListener)
            }
            tempPath = Utils.getTempPath(request.dirPath, request.fileName)
            val file = File(tempPath)
            var model = downloadModelIfAlreadyPresentInDatabase
            if (model != null) {
                if (file.exists()) {
                    request.totalBytes = model.totalBytes
                    request.downloadedBytes = model.downloadedBytes
                } else {
                    removeNoMoreNeededModelFromDatabase()
                    request.downloadedBytes = 0
                    request.totalBytes = 0
                    model = null
                }
            }
            httpClient = ComponentHolder.instance.getHttpClient()
            httpClient!!.connect(request)
            if (request.status == Status.CANCELLED) {
                response.isCancelled = true
                return response
            } else if (request.status == Status.PAUSED) {
                response.isPaused = true
                return response
            }
            httpClient = Utils.getRedirectedConnectionIfAny(httpClient!!, request)
            responseCode = httpClient!!.responseCode
            eTag = httpClient!!.getResponseHeader(Constants.ETAG)
            if (checkIfFreshStartRequiredAndStart(model)) {
                model = null
            }
            if (!isSuccessful) {
                val error = Error()
                error.isServerError = true
                error.serverErrorMessage = convertStreamToString(httpClient!!.errorStream)
                error.headerFields = httpClient!!.headerFields
                error.responseCode = responseCode
                response.error = error
                return response
            }
            setResumeSupportedOrNot()
            totalBytes = request.totalBytes
            if (!isResumeSupported) {
                deleteTempFile()
            }
            if (totalBytes == 0L) {
                totalBytes = httpClient!!.contentLength
                request.totalBytes = totalBytes
            }
            if (isResumeSupported && model == null) {
                createAndInsertNewModel()
            }
            if (request.status == Status.CANCELLED) {
                response.isCancelled = true
                return response
            } else if (request.status == Status.PAUSED) {
                response.isPaused = true
                return response
            }
            request.deliverStartEvent()
            inputStream = httpClient!!.inputStream
            val buff = ByteArray(BUFFER_SIZE)
            if (!file.exists()) {
                if (file.parentFile != null && !file.parentFile.exists()) {
                    if (file.parentFile.mkdirs()) {
                        file.createNewFile()
                    }
                } else {
                    file.createNewFile()
                }
            }
            outputStream = FileDownloadRandomAccessFile.create(file)
            if (isResumeSupported && request.downloadedBytes != 0L) {
                outputStream!!.seek(request.downloadedBytes)
            }
            if (request.status == Status.CANCELLED) {
                response.isCancelled = true
                return response
            } else if (request.status == Status.PAUSED) {
                response.isPaused = true
                return response
            }
            do {
                val byteCount = inputStream!!.read(buff, 0, BUFFER_SIZE)
                if (byteCount == -1) {
                    break
                }
                outputStream!!.write(buff, 0, byteCount)
                request.downloadedBytes = request.downloadedBytes + byteCount
                sendProgress()
                syncIfRequired(outputStream)
                if (request.status == Status.CANCELLED) {
                    response.isCancelled = true
                    return response
                } else if (request.status == Status.PAUSED) {
                    sync(outputStream)
                    response.isPaused = true
                    return response
                }
            } while (true)
            val path = Utils.getPath(request.dirPath, request.fileName)
            Utils.renameFileName(tempPath!!, path)
            response.isSuccessful = true
            if (isResumeSupported) {
                removeNoMoreNeededModelFromDatabase()
            }
        } catch (e: IOException) {
            if (!isResumeSupported) {
                deleteTempFile()
            }
            val error = Error()
            error.isConnectionError = true
            error.connectionException = e
            response.error = error
        } catch (e: IllegalAccessException) {
            if (!isResumeSupported) {
                deleteTempFile()
            }
            val error = Error()
            error.isConnectionError = true
            error.connectionException = e
            response.error = error
        } finally {
            closeAllSafely(outputStream)
        }
        return response
    }

    private fun deleteTempFile() {
        val file = File(tempPath)
        if (file.exists()) {
            file.delete()
        }
    }

    private val isSuccessful: Boolean
        get() = (responseCode >= HttpURLConnection.HTTP_OK
                && responseCode < HttpURLConnection.HTTP_MULT_CHOICE)

    private fun setResumeSupportedOrNot() {
        isResumeSupported = responseCode == HttpURLConnection.HTTP_PARTIAL
    }

    @Throws(IOException::class, IllegalAccessException::class)
    private fun checkIfFreshStartRequiredAndStart(model: DownloadModel?): Boolean {
        if (responseCode == Constants.HTTP_RANGE_NOT_SATISFIABLE || isETagChanged(model)) {
            if (model != null) {
                removeNoMoreNeededModelFromDatabase()
            }
            deleteTempFile()
            request.downloadedBytes = 0
            request.totalBytes = 0
            httpClient = ComponentHolder.instance.getHttpClient()
            httpClient!!.connect(request)
            httpClient = Utils.getRedirectedConnectionIfAny(httpClient!!, request)
            responseCode = httpClient!!.responseCode
            return true
        }
        return false
    }

    private fun isETagChanged(model: DownloadModel?): Boolean {
        return (!(eTag == null || model == null || model.eTag == null)
                && model.eTag != eTag)
    }

    private val downloadModelIfAlreadyPresentInDatabase: DownloadModel?
        get() = ComponentHolder.instance.getDbHelper()
            .find(request.downloadId)

    private fun createAndInsertNewModel() {
        val model = DownloadModel()
        model.id = request.downloadId
        model.url = request.url
        model.eTag = eTag
        model.dirPath = request.dirPath
        model.fileName = request.fileName
        model.downloadedBytes = request.downloadedBytes
        model.totalBytes = totalBytes
        model.lastModifiedAt = System.currentTimeMillis()
        ComponentHolder.instance.getDbHelper().insert(model)
    }

    private fun removeNoMoreNeededModelFromDatabase() {
        ComponentHolder.instance.getDbHelper().remove(request.downloadId)
    }

    private fun sendProgress() {
        if (request.status != Status.CANCELLED) {
            if (progressHandler != null) {
                progressHandler!!
                    .obtainMessage(
                        Constants.UPDATE,
                        Progress(
                            request.downloadedBytes,
                            totalBytes
                        )
                    ).sendToTarget()
            }
        }
    }

    private fun syncIfRequired(outputStream: FileDownloadOutputStream?) {
        val currentBytes = request.downloadedBytes
        val currentTime = System.currentTimeMillis()
        val bytesDelta = currentBytes - lastSyncBytes
        val timeDelta = currentTime - lastSyncTime
        if (bytesDelta > MIN_BYTES_FOR_SYNC && timeDelta > TIME_GAP_FOR_SYNC) {
            sync(outputStream)
            lastSyncBytes = currentBytes
            lastSyncTime = currentTime
        }
    }

    private fun sync(outputStream: FileDownloadOutputStream?) {
        var success: Boolean
        try {
            outputStream!!.flushAndSync()
            success = true
        } catch (e: IOException) {
            success = false
            e.printStackTrace()
        }
        if (success && isResumeSupported) {
            ComponentHolder.instance.getDbHelper()
                .updateProgress(
                    request.downloadId,
                    request.downloadedBytes,
                    System.currentTimeMillis()
                )
        }
    }

    private fun closeAllSafely(outputStream: FileDownloadOutputStream?) {
        if (httpClient != null) {
            try {
                httpClient!!.close()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        if (inputStream != null) {
            try {
                inputStream!!.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        try {
            if (outputStream != null) {
                try {
                    sync(outputStream)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } finally {
            if (outputStream != null) try {
                outputStream.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    private fun convertStreamToString(stream: InputStream?): String {
        val stringBuilder = StringBuilder()
        if (stream != null) {
            var line: String?
            var bufferedReader: BufferedReader? = null
            try {
                bufferedReader = BufferedReader(InputStreamReader(stream))
                while (bufferedReader.readLine().also { line = it } != null) {
                    stringBuilder.append(line)
                }
            } catch (ignored: IOException) {
            } finally {
                try {
                    bufferedReader?.close()
                } catch (ignored: NullPointerException) {
                } catch (ignored: IOException) {
                }
            }
        }
        return stringBuilder.toString()
    }

    companion object {
        private const val BUFFER_SIZE = 1024 * 4
        private const val TIME_GAP_FOR_SYNC: Long = 2000
        private const val MIN_BYTES_FOR_SYNC: Long = 65536
        fun create(request: DownloadRequest): DownloadTask {
            return DownloadTask(request)
        }
    }
}