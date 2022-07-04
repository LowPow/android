package com.sample

import android.app.Application
import com.downloader.Downloader
import com.downloader.DownloaderConfig

class SampleApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val config: DownloaderConfig = DownloaderConfig.newBuilder()
            .setDatabaseEnabled(true)
            .build()
        Downloader.initialize(this, config)
    }
}