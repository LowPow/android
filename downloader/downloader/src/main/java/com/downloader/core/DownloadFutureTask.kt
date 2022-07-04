package com.downloader.core

import com.downloader.internal.DownloadRunnable
import java.util.concurrent.FutureTask

class DownloadFutureTask internal constructor(private val runnable: DownloadRunnable) :
    FutureTask<DownloadRunnable?>(
        runnable, null
    ), Comparable<DownloadFutureTask> {
    override fun compareTo(other: DownloadFutureTask): Int {
        val p1 = runnable.priority
        val p2 = other.runnable.priority
        return if (p1 == p2) runnable.sequence - other.runnable.sequence else p2!!.ordinal - p1!!.ordinal
    }
}