package com.downloader.internal

import com.downloader.Response
import com.downloader.request.DownloadRequest

class SynchronousCall(val request: DownloadRequest) {
    fun execute(): Response {
        val downloadTask: DownloadTask = DownloadTask.create(request)
        return downloadTask.run()
    }
}