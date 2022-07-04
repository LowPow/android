package com.downloader.database

class DownloadModel {
    var id = 0
    var url: String? = null
    var eTag: String? = null
    var dirPath: String? = null
    var fileName: String? = null
    var totalBytes: Long = 0
    var downloadedBytes: Long = 0
    var lastModifiedAt: Long = 0

    companion object {
        const val ID = "id"
        const val URL = "url"
        const val ETAG = "etag"
        const val DIR_PATH = "dir_path"
        const val FILE_NAME = "file_name"
        const val TOTAL_BYTES = "total_bytes"
        const val DOWNLOADED_BYTES = "downloaded_bytes"
        const val LAST_MODIFIED_AT = "last_modified_at"
    }
}