package com.downloader.core

import java.util.concurrent.Executor

interface ExecutorSupplier {
    fun forDownloadTasks(): DownloadExecutor
    fun forBackgroundTasks(): Executor
    fun forMainThreadTasks(): Executor
}