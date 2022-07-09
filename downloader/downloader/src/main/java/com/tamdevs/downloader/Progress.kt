package com.tamdevs.downloader

import java.io.Serializable

class Progress(var currentBytes: Long, var totalBytes: Long) : Serializable {
    override fun toString(): String {
        return "Progress{" +
                "currentBytes=" + currentBytes +
                ", totalBytes=" + totalBytes +
                '}'
    }
}