package com.tamdevs.downloader.handler

import android.os.Handler
import android.os.Looper
import android.os.Message
import com.tamdevs.downloader.Constants
import com.tamdevs.downloader.OnProgressListener
import com.tamdevs.downloader.Progress

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