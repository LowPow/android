package com.tamdevs.downloader.internal

import android.content.Context
import com.tamdevs.downloader.Constants
import com.tamdevs.downloader.Downloader
import com.tamdevs.downloader.DownloaderConfig
import com.tamdevs.downloader.database.AppDbHelper
import com.tamdevs.downloader.database.DbHelper
import com.tamdevs.downloader.database.NoOpsDbHelper
import com.tamdevs.downloader.httpclient.DefaultHttpClient
import com.tamdevs.downloader.httpclient.HttpClient

class ComponentHolder {
    private var readTimeout = 0
    private var connectTimeout = 0
    private var userAgent: String? = null
    private var httpClient: HttpClient? = null
    private var dbHelper: DbHelper? = null
    fun init(context: Context?, config: DownloaderConfig) {
        readTimeout = config.readTimeout
        connectTimeout = config.connectTimeout
        userAgent = config.userAgent
        httpClient = config.httpClient
        dbHelper = if (config.isDatabaseEnabled) AppDbHelper(context) else NoOpsDbHelper()
        if (config.isDatabaseEnabled) {
            Downloader.cleanUp(30)
        }
    }

    fun getReadTimeout(): Int {
        if (readTimeout == 0) {
            synchronized(ComponentHolder::class.java) {
                if (readTimeout == 0) {
                    readTimeout = Constants.DEFAULT_READ_TIMEOUT_IN_MILLS
                }
            }
        }
        return readTimeout
    }

    fun getConnectTimeout(): Int {
        if (connectTimeout == 0) {
            synchronized(ComponentHolder::class.java) {
                if (connectTimeout == 0) {
                    connectTimeout = Constants.DEFAULT_CONNECT_TIMEOUT_IN_MILLS
                }
            }
        }
        return connectTimeout
    }

    fun getUserAgent(): String? {
        if (userAgent == null) {
            synchronized(ComponentHolder::class.java) {
                if (userAgent == null) {
                    userAgent = Constants.DEFAULT_USER_AGENT
                }
            }
        }
        return userAgent
    }

    fun getDbHelper(): DbHelper {
        if (dbHelper == null) {
            synchronized(ComponentHolder::class.java) {
                if (dbHelper == null) {
                    dbHelper = NoOpsDbHelper()
                }
            }
        }
        return dbHelper!!
    }

    fun getHttpClient(): HttpClient {
        if (httpClient == null) {
            synchronized(ComponentHolder::class.java) {
                if (httpClient == null) {
                    httpClient = DefaultHttpClient()
                }
            }
        }
        return httpClient!!.clone()
    }

    companion object {
        val instance = ComponentHolder()
    }
}