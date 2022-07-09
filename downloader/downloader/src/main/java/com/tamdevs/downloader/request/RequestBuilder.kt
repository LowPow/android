package com.tamdevs.downloader.request

import com.tamdevs.downloader.Priority

interface RequestBuilder {
    fun setHeader(name: String, value: String): RequestBuilder
    fun setPriority(priority: Priority): RequestBuilder
    fun setTag(tag: Any?): RequestBuilder
    fun setReadTimeout(readTimeout: Int): RequestBuilder
    fun setConnectTimeout(connectTimeout: Int): RequestBuilder
    fun setUserAgent(userAgent: String?): RequestBuilder
}