package com.downloader.core

import android.os.Process
import java.util.concurrent.ThreadFactory

class PriorityThreadFactory internal constructor(private val mThreadPriority: Int) : ThreadFactory {
    override fun newThread(runnable: Runnable): Thread {
        val wrapperRunnable = Runnable {
            try {
                Process.setThreadPriority(mThreadPriority)
            } catch (ignored: Throwable) {
            }
            runnable.run()
        }
        return Thread(wrapperRunnable)
    }
}