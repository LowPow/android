package com.tamdevs.downloader.database

class NoOpsDbHelper : DbHelper {
    override fun find(id: Int): DownloadModel? {
        return null
    }

    override fun insert(model: DownloadModel) {}
    override fun update(model: DownloadModel) {}
    override fun updateProgress(id: Int, downloadedBytes: Long, lastModifiedAt: Long) {}
    override fun remove(id: Int) {}
    override fun getUnwantedModels(days: Int): List<DownloadModel>? {
        return null
    }

    override fun clear() {}
}