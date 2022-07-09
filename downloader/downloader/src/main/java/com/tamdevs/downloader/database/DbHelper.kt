package com.tamdevs.downloader.database

interface DbHelper {
    fun find(id: Int): DownloadModel?
    fun insert(model: DownloadModel)
    fun update(model: DownloadModel)
    fun updateProgress(id: Int, downloadedBytes: Long, lastModifiedAt: Long)
    fun remove(id: Int)
    fun getUnwantedModels(days: Int): List<DownloadModel>?
    fun clear()
}