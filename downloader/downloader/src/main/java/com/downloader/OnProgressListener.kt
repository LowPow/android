package com.downloader

fun interface OnProgressListener {
    fun onProgress(progress: Progress)
}