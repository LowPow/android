package com.tamdevs.downloader.request

import com.tamdevs.downloader.*
import com.tamdevs.downloader.core.Core
import com.tamdevs.downloader.internal.ComponentHolder
import com.tamdevs.downloader.internal.DownloadRequestQueue
import com.tamdevs.downloader.internal.SynchronousCall
import com.tamdevs.downloader.utils.Utils
import java.util.concurrent.Future

class DownloadRequest internal constructor(builder: DownloadRequestBuilder) {
    var priority: Priority?
    var tag: Any?
    var url: String?
    var dirPath: String?
    var fileName: String?
    var sequenceNumber = 0
    var future: Future<*>? = null
    var downloadedBytes: Long = 0
    var totalBytes: Long = 0
    var readTimeout: Int
    var connectTimeout: Int
    var userAgent: String?
    var onProgressListener: OnProgressListener? = null
        private set
    private var onDownloadListener: OnDownloadListener? = null
    private var onStartOrResumeListener: OnStartOrResumeListener? = null
    private var onPauseListener: OnPauseListener? = null
    private var onCancelListener: OnCancelListener? = null
    var downloadId = 0
    val headers: HashMap<String, MutableList<String>>?
    var status: Status? = null

    @JvmName("getUserAgent1")
    fun getUserAgent(): String? {
        if (userAgent == null) {
            userAgent = ComponentHolder.instance.getUserAgent()
        }
        return userAgent
    }

    @JvmName("setUserAgent1")
    fun setUserAgent(userAgent: String?) {
        this.userAgent = userAgent
    }

    fun setOnStartOrResumeListener(onStartOrResumeListener: OnStartOrResumeListener?): DownloadRequest {
        this.onStartOrResumeListener = onStartOrResumeListener
        return this
    }

    fun setOnProgressListener(onProgressListener: OnProgressListener?): DownloadRequest {
        this.onProgressListener = onProgressListener
        return this
    }

    fun setOnPauseListener(onPauseListener: OnPauseListener?): DownloadRequest {
        this.onPauseListener = onPauseListener
        return this
    }

    fun setOnCancelListener(onCancelListener: OnCancelListener?): DownloadRequest {
        this.onCancelListener = onCancelListener
        return this
    }

    fun start(onDownloadListener: OnDownloadListener): Int {
        this.onDownloadListener = onDownloadListener
        downloadId = Utils.getUniqueId(url, dirPath, fileName)
        DownloadRequestQueue.instance!!.addRequest(this)
        return downloadId
    }

    fun executeSync(): Response {
        downloadId = Utils.getUniqueId(url, dirPath, fileName)
        return SynchronousCall(this).execute()
    }

    fun deliverError(error: Error) {
        if (status != Status.CANCELLED) {
            status = Status.FAILED
            Core.getInstance().executorSupplier.forMainThreadTasks()
                .execute {
                    if (onDownloadListener != null) {
                        onDownloadListener!!.onError(error)
                    }
                    finish()
                }
        }
    }

    fun deliverSuccess() {
        if (status != Status.CANCELLED) {
            status = Status.COMPLETED
            Core.getInstance().executorSupplier.forMainThreadTasks()
                .execute {
                    if (onDownloadListener != null) {
                        onDownloadListener!!.onDownloadComplete()
                    }
                    finish()
                }
        }
    }

    fun deliverStartEvent() {
        if (status != Status.CANCELLED) {
            Core.getInstance().executorSupplier.forMainThreadTasks()
                .execute {
                    if (onStartOrResumeListener != null) {
                        onStartOrResumeListener!!.onStartOrResume()
                    }
                }
        }
    }

    fun deliverPauseEvent() {
        if (status != Status.CANCELLED) {
            Core.getInstance().executorSupplier.forMainThreadTasks()
                .execute {
                    if (onPauseListener != null) {
                        onPauseListener!!.onPause()
                    }
                }
        }
    }

    private fun deliverCancelEvent() {
        Core.getInstance().executorSupplier.forMainThreadTasks()
            .execute {
                if (onCancelListener != null) {
                    onCancelListener!!.onCancel()
                }
            }
    }

    fun cancel() {
        status = Status.CANCELLED
        if (future != null) {
            future!!.cancel(true)
        }
        deliverCancelEvent()
        Utils.deleteTempFileAndDatabaseEntryInBackground(
            Utils.getTempPath(dirPath, fileName),
            downloadId
        )
    }

    private fun finish() {
        destroy()
        DownloadRequestQueue.instance?.finish(this)
    }

    private fun destroy() {
        onProgressListener = null
        onDownloadListener = null
        onStartOrResumeListener = null
        onPauseListener = null
        onCancelListener = null
    }

    private val readTimeoutFromConfig: Int
        get() = ComponentHolder.instance.getReadTimeout()
    private val connectTimeoutFromConfig: Int
        get() = ComponentHolder.instance.getConnectTimeout()

    init {
        url = builder.url
        dirPath = builder.dirPath
        fileName = builder.fileName
        headers = builder.headerMap
        priority = builder.priority
        tag = builder.tag
        readTimeout = if (builder.readTimeout != 0) builder.readTimeout else readTimeoutFromConfig
        connectTimeout =
            if (builder.connectTimeout != 0) builder.connectTimeout else connectTimeoutFromConfig
        userAgent = builder.userAgent
    }
}