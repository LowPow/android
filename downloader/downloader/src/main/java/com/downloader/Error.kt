package com.downloader

class Error {
    var isServerError = false
    var isConnectionError = false
    var serverErrorMessage: String? = null
    var headerFields: Map<String?, List<String?>?>? = null
    var connectionException: Throwable? = null
    var responseCode = 0
}