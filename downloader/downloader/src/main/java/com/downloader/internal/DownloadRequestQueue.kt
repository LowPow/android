package com.downloader.internal

import com.downloader.Status
import com.downloader.core.Core
import com.downloader.request.DownloadRequest
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger

class DownloadRequestQueue private constructor() {

    private val currentRequestMap: MutableMap<Int, DownloadRequest>
    private val sequenceGenerator: AtomicInteger
    private val sequenceNumber: Int
        get() = sequenceGenerator.incrementAndGet()

    fun pause(downloadId: Int) {
        val request = currentRequestMap[downloadId]
        if (request != null) {
            request.status = Status.PAUSED
        }
    }

    fun resume(downloadId: Int) {
        val request = currentRequestMap[downloadId]
        if (request != null) {
            request.status = Status.QUEUED
            request.future = Core.getInstance()
                .executorSupplier
                .forDownloadTasks()
                .submit(DownloadRunnable(request))
        }
    }

    private fun cancelAndRemoveFromMap(request: DownloadRequest?) {
        if (request != null) {
            request.cancel()
            currentRequestMap.remove(request.downloadId)
        }
    }

    fun cancel(downloadId: Int) {
        val request = currentRequestMap[downloadId]
        cancelAndRemoveFromMap(request)
    }

    fun cancel(tag: Any) {
        for ((_, request) in currentRequestMap) {
            if (request.tag is String && tag is String) {
                val tempRequestTag = request.tag as String
                if (tempRequestTag == tag) {
                    cancelAndRemoveFromMap(request)
                }
            } else if (request.tag == tag) {
                cancelAndRemoveFromMap(request)
            }
        }
    }

    fun cancelAll() {
        for ((_, request) in currentRequestMap) {
            cancelAndRemoveFromMap(request)
        }
    }

    fun getStatus(downloadId: Int): Status? {
        val request = currentRequestMap[downloadId]
        return if (request != null) {
            request.status
        } else Status.UNKNOWN
    }

    fun addRequest(request: DownloadRequest) {
        currentRequestMap[request.downloadId] = request
        request.status = Status.QUEUED
        request.sequenceNumber = sequenceNumber
        request.future = Core.getInstance()
            .executorSupplier
            .forDownloadTasks()
            .submit(DownloadRunnable(request))
    }

    fun finish(request: DownloadRequest) {
        currentRequestMap.remove(request.downloadId)
    }

    companion object {
        var instance: DownloadRequestQueue? = null
            get() {
                if (field == null) {
                    synchronized(DownloadRequestQueue::class.java) {
                        if (field == null) {
                            field = DownloadRequestQueue()
                        }
                    }
                }
                return field
            }
            private set

        fun initialize() {
            instance
        }
    }

    init {
        currentRequestMap = ConcurrentHashMap()
        sequenceGenerator = AtomicInteger()
    }
}
