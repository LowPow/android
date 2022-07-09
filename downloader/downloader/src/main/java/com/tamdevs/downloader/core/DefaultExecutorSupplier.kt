package com.tamdevs.downloader.core

import android.os.Process
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.ThreadFactory

class DefaultExecutorSupplier internal constructor() : ExecutorSupplier {
    private val networkExecutor: DownloadExecutor
    private val backgroundExecutor: Executor
    private val mainThreadExecutor: Executor
    override fun forDownloadTasks(): DownloadExecutor {
        return networkExecutor
    }

    override fun forBackgroundTasks(): Executor {
        return backgroundExecutor
    }

    override fun forMainThreadTasks(): Executor {
        return mainThreadExecutor
    }

    companion object {
        private val DEFAULT_MAX_NUM_THREADS = 2 * Runtime.getRuntime().availableProcessors() + 1
    }

    init {
        val backgroundPriorityThreadFactory: ThreadFactory =
            PriorityThreadFactory(Process.THREAD_PRIORITY_BACKGROUND)
        networkExecutor = DownloadExecutor(DEFAULT_MAX_NUM_THREADS, backgroundPriorityThreadFactory)
        backgroundExecutor = Executors.newSingleThreadExecutor()
        mainThreadExecutor = MainThreadExecutor()
    }
}