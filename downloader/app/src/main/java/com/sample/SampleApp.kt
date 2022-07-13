package com.sample

import android.app.Application
import com.tamdevs.downloader.Downloader
import com.tamdevs.downloader.DownloaderConfig

class SampleApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val config: DownloaderConfig = DownloaderConfig.newBuilder()
            .setDatabaseEnabled(true)
            .build()
        Downloader.initialize(this, config)
    }
}