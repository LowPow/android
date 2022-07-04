package com.downloader.httpclient

import com.downloader.Constants
import com.downloader.request.DownloadRequest
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection
import java.util.*

class DefaultHttpClient : HttpClient {
    private var connection: URLConnection? = null
    override fun clone(): HttpClient {
        return DefaultHttpClient()
    }

    @Throws(IOException::class)
    override fun connect(request: DownloadRequest) {
        connection = URL(request.url).openConnection()
        connection!!.readTimeout = request.readTimeout
        connection!!.connectTimeout = request.connectTimeout
        val range = String.format(
            Locale.ENGLISH,
            "bytes=%d-", request.downloadedBytes
        )
        connection!!.addRequestProperty(Constants.RANGE, range)
        connection!!.addRequestProperty(Constants.USER_AGENT, request.userAgent)
        addHeaders(request)
        connection!!.connect()
    }

    @get:Throws(IOException::class)
    override val responseCode: Int
        get() {
            var responseCode = 0
            if (connection is HttpURLConnection) {
                responseCode = (connection as HttpURLConnection).responseCode
            }
            return responseCode
        }

    @get:Throws(IOException::class)
    override val inputStream: InputStream?
        get() = connection!!.getInputStream()
    override val contentLength: Long
        get() {
            val length = connection!!.getHeaderField("Content-Length")
            return try {
                length.toLong()
            } catch (e: NumberFormatException) {
                -1
            }
        }

    override fun getResponseHeader(name: String?): String? {
        return connection!!.getHeaderField(name)
    }

    override fun close() {
        // no operation
    }

    override val headerFields: Map<String?, List<String?>?>?
        get() = connection!!.headerFields
    override val errorStream: InputStream?
        get() = if (connection is HttpURLConnection) {
            (connection as HttpURLConnection).errorStream
        } else null

    private fun addHeaders(request: DownloadRequest) {
        val headers = request.headers
        if (headers != null) {
            val entries: Set<Map.Entry<String?, List<String?>?>> = headers.entries
            for ((name, list) in entries) {
                if (list != null) {
                    for (value in list) {
                        connection!!.addRequestProperty(name, value)
                    }
                }
            }
        }
    }
}