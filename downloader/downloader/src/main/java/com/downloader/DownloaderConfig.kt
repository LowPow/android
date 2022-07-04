package com.downloader

import com.downloader.httpclient.DefaultHttpClient
import com.downloader.httpclient.HttpClient

class DownloaderConfig private constructor(builder: Builder) {
    var readTimeout: Int
    var connectTimeout: Int
    var userAgent: String?
    var httpClient: HttpClient
    var isDatabaseEnabled: Boolean

    class Builder {
        var readTimeout = Constants.DEFAULT_READ_TIMEOUT_IN_MILLS
        var connectTimeout = Constants.DEFAULT_CONNECT_TIMEOUT_IN_MILLS
        var userAgent: String? = Constants.DEFAULT_USER_AGENT
        var httpClient: HttpClient = DefaultHttpClient()
        var databaseEnabled = false
        fun setReadTimeout(readTimeout: Int): Builder {
            this.readTimeout = readTimeout
            return this
        }

        fun setConnectTimeout(connectTimeout: Int): Builder {
            this.connectTimeout = connectTimeout
            return this
        }

        fun setUserAgent(userAgent: String?): Builder {
            this.userAgent = userAgent
            return this
        }

        fun setHttpClient(httpClient: HttpClient): Builder {
            this.httpClient = httpClient
            return this
        }

        fun setDatabaseEnabled(databaseEnabled: Boolean): Builder {
            this.databaseEnabled = databaseEnabled
            return this
        }

        fun build(): DownloaderConfig {
            return DownloaderConfig(this)
        }
    }

    companion object {
        fun newBuilder(): Builder {
            return Builder()
        }
    }

    init {
        readTimeout = builder.readTimeout
        connectTimeout = builder.connectTimeout
        userAgent = builder.userAgent
        httpClient = builder.httpClient
        isDatabaseEnabled = builder.databaseEnabled
    }
}