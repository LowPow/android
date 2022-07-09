package com.sample.data.constant

import com.sample.data.model.DownloadFiles

object Constant {

    // Download files url. Some of them are not valid. So, we can use that to handle error.
    // appsapk.com doesn't returns content length.
    var downloadFiles: List<DownloadFiles> = listOf(
        DownloadFiles(
            "https://www.appsapk.com/downloading/latest/WeChat-6.5.7.apk",
            0,
            "Wechat.apk"
        ),
        DownloadFiles(
            "https://www.appsapk.com/downloading/latest/Emoji%20Flashlight%20-%20Brightest%20Flashlight%202018-2.0.1.apk",
            0,
            "Flashlight.apk"
        ),
        DownloadFiles(
            "https://www.appsapk.com/downloading/latest/Screen%20Recorder-7.7.apk",
            0,
            "Screen_Recorder.apk"
        ),
        DownloadFiles(
            "https://www.appsapk.com/downloading/latest/Call%20Recorder%20-%20Automatic%20Call%20Recorder-1.6.0.apk",
            0,
            "Automatic_Call_Recorder.apk"
        ),
        DownloadFiles(
            "https://www.appsapk.com/downloading/latest/Sound%20Profile%20(+%20volume%20scheduler)-5.25.apk",
            0,
            "Sound_Profile.apk"
        ),
        DownloadFiles(
            "https://www.appsapk.com/downloading/latest/UC-Browser.apk",
            0,
            "UC-Browser.apk"
        ),
        DownloadFiles(
            "https://www.appsapk.com/downloading/latest/Barcode%20Scanner-1.2.apk",
            0,
            "Barcode_Scanner.apk"
        ),
        DownloadFiles(
            "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
            0,
            "BigBuckBunny.mp4"
        ),
        DownloadFiles(
            "https://ia804501.us.archive.org/7/items/anewenglishhind00fallgoog/anewenglishhind00fallgoog.pdf",
            0,
            "Dictionary.pdf"
        ),
        DownloadFiles("https://media.giphy.com/media/Bk0CW5frw4qfS/giphy.gif", 0, "giphy.gif"),
        DownloadFiles("https://techslides.com/demos/sample-videos/small.mp4", 0, "small.mp4"),
    )

}