package com.tamdevs.downloader

fun interface OnProgressListener {
    fun onProgress(progress: Progress)
}