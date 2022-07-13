package com.sample.data.model

data class DownloadFiles(
    val url: String,
    var downloadId: Int = 0,
    val fileName: String
)
