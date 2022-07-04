package com.downloader.handler

import android.os.Handler
import android.os.Looper
import android.os.Message
import com.downloader.Constants
import com.downloader.OnProgressListener
import com.downloader.Progress

class ProgressHandler(private val listener: OnProgressListener?) : Handler(Looper.getMainLooper()) {
    override fun handleMessage(msg: Message) {
        when (msg.what) {
            Constants.UPDATE -> if (listener != null) {
                val progress = msg.obj as Progress
                listener.onProgress(progress)
            }
            else -> super.handleMessage(msg)
        }
    }
}