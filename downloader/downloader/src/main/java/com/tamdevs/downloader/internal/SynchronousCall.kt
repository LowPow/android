package com.tamdevs.downloader.internal

import com.tamdevs.downloader.Response
import com.tamdevs.downloader.request.DownloadRequest

class SynchronousCall(val request: DownloadRequest) {
    fun execute(): Response {
        val downloadTask: DownloadTask = DownloadTask.create(request)
        return downloadTask.run()
    }
}