package com.tamdevs.downloader.core

import com.tamdevs.downloader.internal.DownloadRunnable
import java.util.concurrent.*

class DownloadExecutor internal constructor(maxNumThreads: Int, threadFactory: ThreadFactory?) :
    ThreadPoolExecutor(
        maxNumThreads, maxNumThreads, 0, TimeUnit.MILLISECONDS,
        PriorityBlockingQueue(), threadFactory
    ) {
    override fun submit(task: Runnable): Future<*> {
        val futureTask = DownloadFutureTask(task as DownloadRunnable)
        execute(futureTask)
        return futureTask
    }
}