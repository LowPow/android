package com.tamdevs.downloader

interface OnDownloadListener {
    fun onDownloadComplete()
    fun onError(error: Error)
}