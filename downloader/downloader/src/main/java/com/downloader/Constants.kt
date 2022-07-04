package com.downloader

object Constants {
    const val UPDATE = 0x01
    const val RANGE = "Range"
    const val ETAG = "ETag"
    const val USER_AGENT = "User-Agent"
    const val DEFAULT_USER_AGENT = "Downloader"
    const val DEFAULT_READ_TIMEOUT_IN_MILLS = 20000
    const val DEFAULT_CONNECT_TIMEOUT_IN_MILLS = 20000
    const val HTTP_RANGE_NOT_SATISFIABLE = 416
    const val HTTP_TEMPORARY_REDIRECT = 307
    const val HTTP_PERMANENT_REDIRECT = 308
}