package com.tamdevs.downloader.internal

import com.tamdevs.downloader.Error
import com.tamdevs.downloader.Priority
import com.tamdevs.downloader.Status
import com.tamdevs.downloader.request.DownloadRequest

class DownloadRunnable internal constructor(val request: DownloadRequest) : Runnable {
    val priority: Priority? = request.priority
    val sequence: Int = request.sequenceNumber
    override fun run() {
        request.status = Status.RUNNING
        val downloadTask: DownloadTask = DownloadTask.create(request)
        val response = downloadTask.run()
        if (response.isSuccessful) {
            request.deliverSuccess()
        } else if (response.isPaused) {
            request.deliverPauseEvent()
        } else if (response.error != null) {
            request.deliverError(response.error!!)
        } else if (!response.isCancelled) {
            request.deliverError(Error())
        }
    }

}