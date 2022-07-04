package com.downloader.httpclient

import com.downloader.request.DownloadRequest
import java.io.IOException
import java.io.InputStream

interface HttpClient : Cloneable {
    public override fun clone(): HttpClient

    @Throws(IOException::class)
    fun connect(request: DownloadRequest)

    @get:Throws(IOException::class)
    val responseCode: Int

    @get:Throws(IOException::class)
    val inputStream: InputStream?
    val contentLength: Long
    fun getResponseHeader(name: String?): String?
    fun close()
    val headerFields: Map<String?, List<String?>?>?

    @get:Throws(IOException::class)
    val errorStream: InputStream?
}