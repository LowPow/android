package com.downloader

interface OnDownloadListener {
    fun onDownloadComplete()
    fun onError(error: Error)
}