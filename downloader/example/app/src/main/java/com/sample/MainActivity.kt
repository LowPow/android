package com.sample

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import com.downloader.*
import com.sample.utils.Utils

class MainActivity : AppCompatActivity() {

    var urls: List<String> = listOf(
        "http://www.appsapk.com/downloading/latest/Facebook-119.0.0.23.70.apk",
        "http://www.appsapk.com/downloading/latest/WeChat-6.5.7.apk",
        "http://www.appsapk.com/downloading/latest/Instagram.apk",
        "http://www.appsapk.com/downloading/latest/Emoji%20Flashlight%20-%20Brightest%20Flashlight%202018-2.0.1.apk",
        "http://www.appsapk.com/downloading/latest/Screen%20Recorder-7.7.apk",
        "http://www.appsapk.com/downloading/latest/Call%20Recorder%20-%20Automatic%20Call%20Recorder-1.6.0.apk",
        "http://www.appsapk.com/downloading/latest/Sound%20Profile%20(+%20volume%20scheduler)-5.25.apk",
        "http://www.appsapk.com/downloading/latest/Evernote%20-%20stay%20organized.-7.9.7.apk",
        "http://www.appsapk.com/downloading/latest/UC-Browser.apk",
        "http://www.appsapk.com/downloading/latest/Barcode%20Scanner-1.2.apk",
        "http://download.blender.org/peach/bigbuckbunny_movies/BigBuckBunny_640x360.m4v",
        "http://www2.sdfi.edu.cn/netclass/jiaoan/englit/download/Harry%20Potter%20and%20the%20Sorcerer's%20Stone.pdf",
        "https://media.giphy.com/media/Bk0CW5frw4qfS/giphy.gif",
        "http://techslides.com/demos/sample-videos/small.mp4",
        "http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_10mb.mp4"
    )
    var buttonOne: Button? = null
    var buttonTwo: Button? = null
    var buttonThree: Button? = null
    var buttonFour: Button? = null
    var buttonFive: Button? = null
    var buttonSix: Button? = null
    var buttonSeven: Button? = null
    var buttonEight: Button? = null
    var buttonNine: Button? = null
    var buttonTen: Button? = null
    var buttonEleven: Button? = null
    var buttonTwelve: Button? = null
    var buttonThirteen: Button? = null
    var buttonFourteen: Button? = null
    var buttonFifteen: Button? = null
    var buttonCancelOne: Button? = null
    var buttonCancelTwo: Button? = null
    var buttonCancelThree: Button? = null
    var buttonCancelFour: Button? = null
    var buttonCancelFive: Button? = null
    var buttonCancelSix: Button? = null
    var buttonCancelSeven: Button? = null
    var buttonCancelEight: Button? = null
    var buttonCancelNine: Button? = null
    var buttonCancelTen: Button? = null
    var buttonCancelEleven: Button? = null
    var buttonCancelTwelve: Button? = null
    var buttonCancelThirteen: Button? = null
    var buttonCancelFourteen: Button? = null
    var buttonCancelFifteen: Button? = null
    var textViewProgressOne: TextView? = null
    var textViewProgressTwo: TextView? = null
    var textViewProgressThree: TextView? = null
    var textViewProgressFour: TextView? = null
    var textViewProgressFive: TextView? = null
    var textViewProgressSix: TextView? = null
    var textViewProgressSeven: TextView? = null
    var textViewProgressEight: TextView? = null
    var textViewProgressNine: TextView? = null
    var textViewProgressTen: TextView? = null
    var textViewProgressEleven: TextView? = null
    var textViewProgressTwelve: TextView? = null
    var textViewProgressThirteen: TextView? = null
    var textViewProgressFourteen: TextView? = null
    var textViewProgressFifteen: TextView? = null
    var progressBarOne: ProgressBar? = null
    var progressBarTwo: ProgressBar? = null
    var progressBarThree: ProgressBar? = null
    var progressBarFour: ProgressBar? = null
    var progressBarFive: ProgressBar? = null
    var progressBarSix: ProgressBar? = null
    var progressBarSeven: ProgressBar? = null
    var progressBarEight: ProgressBar? = null
    var progressBarNine: ProgressBar? = null
    var progressBarTen: ProgressBar? = null
    var progressBarEleven: ProgressBar? = null
    var progressBarTwelve: ProgressBar? = null
    var progressBarThirteen: ProgressBar? = null
    var progressBarFourteen: ProgressBar? = null
    var progressBarFifteen: ProgressBar? = null
    var downloadIdOne = 0
    var downloadIdTwo = 0
    var downloadIdThree = 0
    var downloadIdFour = 0
    var downloadIdFive = 0
    var downloadIdSix = 0
    var downloadIdSeven = 0
    var downloadIdEight = 0
    var downloadIdNine = 0
    var downloadIdTen = 0
    var downloadIdEleven = 0
    var downloadIdTwelve = 0
    var downloadIdThirteen = 0
    var downloadIdFourteen = 0
    var downloadIdFifteen = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            Scaffold {
//                LazyColumn {
//                    items(count = urls.size) {
//                        Column {
//                            LinearProgressIndicator()
//                            Row {
//                                Text("")
//                                TextButton(onClick = {
//
//                                }) {
//
//                                }
//                                Button(onClick = {
//
//                                }) {
//
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
        setContentView(R.layout.activity_main)
        dirPath = Utils.getRootDirPath(applicationContext)
        init()
        onClickListenerOne()
        onClickListenerTwo()
        onClickListenerThree()
        onClickListenerFour()
        onClickListenerFive()
        onClickListenerSix()
        onClickListenerSeven()
        onClickListenerEight()
        onClickListenerNine()
        onClickListenerTen()
        onClickListenerEleven()
        onClickListenerTwelve()
        onClickListenerThirteen()
        onClickListenerFourteen()
        onClickListenerFifteen()
    }

    private fun init() {
        buttonOne = findViewById(R.id.buttonOne)
        buttonTwo = findViewById(R.id.buttonTwo)
        buttonThree = findViewById(R.id.buttonThree)
        buttonFour = findViewById(R.id.buttonFour)
        buttonFive = findViewById(R.id.buttonFive)
        buttonSix = findViewById(R.id.buttonSix)
        buttonSeven = findViewById(R.id.buttonSeven)
        buttonEight = findViewById(R.id.buttonEight)
        buttonNine = findViewById(R.id.buttonNine)
        buttonTen = findViewById(R.id.buttonTen)
        buttonEleven = findViewById(R.id.buttonEleven)
        buttonTwelve = findViewById(R.id.buttonTwelve)
        buttonThirteen = findViewById(R.id.buttonThirteen)
        buttonFourteen = findViewById(R.id.buttonFourteen)
        buttonFifteen = findViewById(R.id.buttonFifteen)
        buttonCancelOne = findViewById(R.id.buttonCancelOne)
        buttonCancelTwo = findViewById(R.id.buttonCancelTwo)
        buttonCancelThree = findViewById(R.id.buttonCancelThree)
        buttonCancelFour = findViewById(R.id.buttonCancelFour)
        buttonCancelFive = findViewById(R.id.buttonCancelFive)
        buttonCancelSix = findViewById(R.id.buttonCancelSix)
        buttonCancelSeven = findViewById(R.id.buttonCancelSeven)
        buttonCancelEight = findViewById(R.id.buttonCancelEight)
        buttonCancelNine = findViewById(R.id.buttonCancelNine)
        buttonCancelTen = findViewById(R.id.buttonCancelTen)
        buttonCancelEleven = findViewById(R.id.buttonCancelEleven)
        buttonCancelTwelve = findViewById(R.id.buttonCancelTwelve)
        buttonCancelThirteen = findViewById(R.id.buttonCancelThirteen)
        buttonCancelFourteen = findViewById(R.id.buttonCancelFourteen)
        buttonCancelFifteen = findViewById(R.id.buttonCancelFifteen)
        textViewProgressOne = findViewById(R.id.textViewProgressOne)
        textViewProgressTwo = findViewById(R.id.textViewProgressTwo)
        textViewProgressThree = findViewById(R.id.textViewProgressThree)
        textViewProgressFour = findViewById(R.id.textViewProgressFour)
        textViewProgressFive = findViewById(R.id.textViewProgressFive)
        textViewProgressSix = findViewById(R.id.textViewProgressSix)
        textViewProgressSeven = findViewById(R.id.textViewProgressSeven)
        textViewProgressEight = findViewById(R.id.textViewProgressEight)
        textViewProgressNine = findViewById(R.id.textViewProgressNine)
        textViewProgressTen = findViewById(R.id.textViewProgressTen)
        textViewProgressEleven = findViewById(R.id.textViewProgressEleven)
        textViewProgressTwelve = findViewById(R.id.textViewProgressTwelve)
        textViewProgressThirteen = findViewById(R.id.textViewProgressThirteen)
        textViewProgressFourteen = findViewById(R.id.textViewProgressFourteen)
        textViewProgressFifteen = findViewById(R.id.textViewProgressFifteen)
        progressBarOne = findViewById(R.id.progressBarOne)
        progressBarTwo = findViewById(R.id.progressBarTwo)
        progressBarThree = findViewById(R.id.progressBarThree)
        progressBarFour = findViewById(R.id.progressBarFour)
        progressBarFive = findViewById(R.id.progressBarFive)
        progressBarSix = findViewById(R.id.progressBarSix)
        progressBarSeven = findViewById(R.id.progressBarSeven)
        progressBarEight = findViewById(R.id.progressBarEight)
        progressBarNine = findViewById(R.id.progressBarNine)
        progressBarTen = findViewById(R.id.progressBarTen)
        progressBarEleven = findViewById(R.id.progressBarEleven)
        progressBarTwelve = findViewById(R.id.progressBarTwelve)
        progressBarThirteen = findViewById(R.id.progressBarThirteen)
        progressBarFourteen = findViewById(R.id.progressBarFourteen)
        progressBarFifteen = findViewById(R.id.progressBarFifteen)
    }

    fun onClickListenerOne() {
        buttonOne!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdOne)) {
                Downloader.pause(downloadIdOne)
                return@OnClickListener
            }
            buttonOne!!.isEnabled = false
            progressBarOne!!.isIndeterminate = true
            progressBarOne!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdOne)) {
                Downloader.resume(downloadIdOne)
                return@OnClickListener
            }
            downloadIdOne = Downloader.download(urls[0], dirPath, "facebook.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarOne!!.isIndeterminate = false
                    buttonOne!!.isEnabled = true
                    buttonOne!!.setText(R.string.pause)
                    buttonCancelOne!!.isEnabled = true
                }
                .setOnPauseListener { buttonOne!!.setText(R.string.resume) }
                .setOnCancelListener {
                    buttonOne!!.setText(R.string.start)
                    buttonCancelOne!!.isEnabled = false
                    progressBarOne!!.progress = 0
                    textViewProgressOne!!.text = ""
                    downloadIdOne = 0
                    progressBarOne!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarOne!!.progress = progressPercent.toInt()
                    textViewProgressOne!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                    progressBarOne!!.isIndeterminate = false
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonOne!!.isEnabled = false
                        buttonCancelOne!!.isEnabled = false
                        buttonOne!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonOne!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "1",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressOne!!.text = ""
                        progressBarOne!!.progress = 0
                        downloadIdOne = 0
                        buttonCancelOne!!.isEnabled = false
                        progressBarOne!!.isIndeterminate = false
                        buttonOne!!.isEnabled = true
                    }
                })
        })
        buttonCancelOne!!.setOnClickListener { Downloader.cancel(downloadIdOne) }
    }

    fun onClickListenerTwo() {
        buttonTwo!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdTwo)) {
                Downloader.pause(downloadIdTwo)
                return@OnClickListener
            }
            buttonTwo!!.isEnabled = false
            progressBarTwo!!.isIndeterminate = true
            progressBarTwo!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdTwo)) {
                Downloader.resume(downloadIdTwo)
                return@OnClickListener
            }
            downloadIdTwo = Downloader.download(urls[1], dirPath, "wechat.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarTwo!!.isIndeterminate = false
                    buttonTwo!!.isEnabled = true
                    buttonTwo!!.setText(R.string.pause)
                    buttonCancelTwo!!.isEnabled = true
                    buttonCancelTwo!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonTwo!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdTwo = 0
                    buttonTwo!!.setText(R.string.start)
                    buttonCancelTwo!!.isEnabled = false
                    progressBarTwo!!.progress = 0
                    textViewProgressTwo!!.text = ""
                    progressBarTwo!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarTwo!!.progress = progressPercent.toInt()
                    textViewProgressTwo!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonTwo!!.isEnabled = false
                        buttonCancelTwo!!.isEnabled = false
                        buttonTwo!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonTwo!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "2",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressTwo!!.text = ""
                        progressBarTwo!!.progress = 0
                        downloadIdTwo = 0
                        buttonCancelTwo!!.isEnabled = false
                        progressBarTwo!!.isIndeterminate = false
                        buttonTwo!!.isEnabled = true
                    }
                })
        })
        buttonCancelTwo!!.setOnClickListener { Downloader.cancel(downloadIdTwo) }
    }

    fun onClickListenerThree() {
        buttonThree!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdThree)) {
                Downloader.pause(downloadIdThree)
                return@OnClickListener
            }
            buttonThree!!.isEnabled = false
            progressBarThree!!.isIndeterminate = true
            progressBarThree!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdThree)) {
                Downloader.resume(downloadIdThree)
                return@OnClickListener
            }
            downloadIdThree = Downloader.download(urls[2], dirPath, "instagram.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarThree!!.isIndeterminate = false
                    buttonThree!!.isEnabled = true
                    buttonThree!!.setText(R.string.pause)
                    buttonCancelThree!!.isEnabled = true
                    buttonCancelThree!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonThree!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdThree = 0
                    buttonThree!!.setText(R.string.start)
                    buttonCancelThree!!.isEnabled = false
                    progressBarThree!!.progress = 0
                    textViewProgressThree!!.text = ""
                    progressBarThree!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarThree!!.progress = progressPercent.toInt()
                    textViewProgressThree!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonThree!!.isEnabled = false
                        buttonCancelThree!!.isEnabled = false
                        buttonThree!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonThree!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "3",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressThree!!.text = ""
                        progressBarThree!!.progress = 0
                        downloadIdThree = 0
                        buttonCancelThree!!.isEnabled = false
                        progressBarThree!!.isIndeterminate = false
                        buttonThree!!.isEnabled = true
                    }
                })
        })
        buttonCancelThree!!.setOnClickListener { Downloader.cancel(downloadIdThree) }
    }

    fun onClickListenerFour() {
        buttonFour!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdFour)) {
                Downloader.pause(downloadIdFour)
                return@OnClickListener
            }
            buttonFour!!.isEnabled = false
            progressBarFour!!.isIndeterminate = true
            progressBarFour!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdFour)) {
                Downloader.resume(downloadIdFour)
                return@OnClickListener
            }
            downloadIdFour = Downloader.download(urls[3], dirPath, "flashlight.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarFour!!.isIndeterminate = false
                    buttonFour!!.isEnabled = true
                    buttonFour!!.setText(R.string.pause)
                    buttonCancelFour!!.isEnabled = true
                    buttonCancelFour!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonFour!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdFour = 0
                    buttonFour!!.setText(R.string.start)
                    buttonCancelFour!!.isEnabled = false
                    progressBarFour!!.progress = 0
                    textViewProgressFour!!.text = ""
                    progressBarFour!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarFour!!.progress = progressPercent.toInt()
                    textViewProgressFour!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonFour!!.isEnabled = false
                        buttonCancelFour!!.isEnabled = false
                        buttonFour!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonFour!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "4",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressFour!!.text = ""
                        progressBarFour!!.progress = 0
                        downloadIdFour = 0
                        buttonCancelFour!!.isEnabled = false
                        progressBarFour!!.isIndeterminate = false
                        buttonFour!!.isEnabled = true
                    }
                })
        })
        buttonCancelFour!!.setOnClickListener { Downloader.cancel(downloadIdFour) }
    }

    fun onClickListenerFive() {
        buttonFive!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdFive)) {
                Downloader.pause(downloadIdFive)
                return@OnClickListener
            }
            buttonFive!!.isEnabled = false
            progressBarFive!!.isIndeterminate = true
            progressBarFive!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdFive)) {
                Downloader.resume(downloadIdFive)
                return@OnClickListener
            }
            downloadIdFive = Downloader.download(urls[4], dirPath, "screenrecorder.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarFive!!.isIndeterminate = false
                    buttonFive!!.isEnabled = true
                    buttonFive!!.setText(R.string.pause)
                    buttonCancelFive!!.isEnabled = true
                    buttonCancelFive!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonFive!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdFive = 0
                    buttonFive!!.setText(R.string.start)
                    buttonCancelFive!!.isEnabled = false
                    progressBarFive!!.progress = 0
                    textViewProgressFive!!.text = ""
                    progressBarFive!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarFive!!.progress = progressPercent.toInt()
                    textViewProgressFive!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonFive!!.isEnabled = false
                        buttonCancelFive!!.isEnabled = false
                        buttonFive!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonFive!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "5",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressFive!!.text = ""
                        progressBarFive!!.progress = 0
                        downloadIdFive = 0
                        buttonCancelFive!!.isEnabled = false
                        progressBarFive!!.isIndeterminate = false
                        buttonFive!!.isEnabled = true
                    }
                })
        })
        buttonCancelFive!!.setOnClickListener { Downloader.cancel(downloadIdFive) }
    }

    fun onClickListenerSix() {
        buttonSix!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdSix)) {
                Downloader.pause(downloadIdSix)
                return@OnClickListener
            }
            buttonSix!!.isEnabled = false
            progressBarSix!!.isIndeterminate = true
            progressBarSix!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdSix)) {
                Downloader.resume(downloadIdSix)
                return@OnClickListener
            }
            downloadIdSix = Downloader.download(urls[5], dirPath, "callrecorder.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarSix!!.isIndeterminate = false
                    buttonSix!!.isEnabled = true
                    buttonSix!!.setText(R.string.pause)
                    buttonCancelSix!!.isEnabled = true
                    buttonCancelSix!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonSix!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdSix = 0
                    buttonSix!!.setText(R.string.start)
                    buttonCancelSix!!.isEnabled = false
                    progressBarSix!!.progress = 0
                    textViewProgressSix!!.text = ""
                    progressBarSix!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarSix!!.progress = progressPercent.toInt()
                    textViewProgressSix!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonSix!!.isEnabled = false
                        buttonCancelSix!!.isEnabled = false
                        buttonSix!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonSix!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "6",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressSix!!.text = ""
                        progressBarSix!!.progress = 0
                        downloadIdSix = 0
                        buttonCancelSix!!.isEnabled = false
                        progressBarSix!!.isIndeterminate = false
                        buttonSix!!.isEnabled = true
                    }
                })
        })
        buttonCancelSix!!.setOnClickListener { Downloader.cancel(downloadIdSix) }
    }

    fun onClickListenerSeven() {
        buttonSeven!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdSeven)) {
                Downloader.pause(downloadIdSeven)
                return@OnClickListener
            }
            buttonSeven!!.isEnabled = false
            progressBarSeven!!.isIndeterminate = true
            progressBarSeven!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdSeven)) {
                Downloader.resume(downloadIdSeven)
                return@OnClickListener
            }
            downloadIdSeven = Downloader.download(urls[6], dirPath, "soundprofile.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarSeven!!.isIndeterminate = false
                    buttonSeven!!.isEnabled = true
                    buttonSeven!!.setText(R.string.pause)
                    buttonCancelSeven!!.isEnabled = true
                    buttonCancelSeven!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonSeven!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdSeven = 0
                    buttonSeven!!.setText(R.string.start)
                    buttonCancelSeven!!.isEnabled = false
                    progressBarSeven!!.progress = 0
                    textViewProgressSeven!!.text = ""
                    progressBarSeven!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarSeven!!.progress = progressPercent.toInt()
                    textViewProgressSeven!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonSeven!!.isEnabled = false
                        buttonCancelSeven!!.isEnabled = false
                        buttonSeven!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonSeven!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "7",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressSeven!!.text = ""
                        progressBarSeven!!.progress = 0
                        downloadIdSeven = 0
                        buttonCancelSeven!!.isEnabled = false
                        progressBarSeven!!.isIndeterminate = false
                        buttonSeven!!.isEnabled = true
                    }
                })
        })
        buttonCancelSeven!!.setOnClickListener { Downloader.cancel(downloadIdSeven) }
    }

    fun onClickListenerEight() {
        buttonEight!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdEight)) {
                Downloader.pause(downloadIdEight)
                return@OnClickListener
            }
            buttonEight!!.isEnabled = false
            progressBarEight!!.isIndeterminate = true
            progressBarEight!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdEight)) {
                Downloader.resume(downloadIdEight)
                return@OnClickListener
            }
            downloadIdEight = Downloader.download(urls[7], dirPath, "evernote.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarEight!!.isIndeterminate = false
                    buttonEight!!.isEnabled = true
                    buttonEight!!.setText(R.string.pause)
                    buttonCancelEight!!.isEnabled = true
                    buttonCancelEight!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonEight!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdEight = 0
                    buttonEight!!.setText(R.string.start)
                    buttonCancelEight!!.isEnabled = false
                    progressBarEight!!.progress = 0
                    textViewProgressEight!!.text = ""
                    progressBarEight!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarEight!!.progress = progressPercent.toInt()
                    textViewProgressEight!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonEight!!.isEnabled = false
                        buttonCancelEight!!.isEnabled = false
                        buttonEight!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonEight!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "8",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressEight!!.text = ""
                        progressBarEight!!.progress = 0
                        downloadIdEight = 0
                        buttonCancelEight!!.isEnabled = false
                        progressBarEight!!.isIndeterminate = false
                        buttonEight!!.isEnabled = true
                    }
                })
        })
        buttonCancelEight!!.setOnClickListener { Downloader.cancel(downloadIdEight) }
    }

    fun onClickListenerNine() {
        buttonNine!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdNine)) {
                Downloader.pause(downloadIdNine)
                return@OnClickListener
            }
            buttonNine!!.isEnabled = false
            progressBarNine!!.isIndeterminate = true
            progressBarNine!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdNine)) {
                Downloader.resume(downloadIdNine)
                return@OnClickListener
            }
            downloadIdNine = Downloader.download(urls[8], dirPath, "ucbrowser.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarNine!!.isIndeterminate = false
                    buttonNine!!.isEnabled = true
                    buttonNine!!.setText(R.string.pause)
                    buttonCancelNine!!.isEnabled = true
                    buttonCancelNine!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonNine!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdNine = 0
                    buttonNine!!.setText(R.string.start)
                    buttonCancelNine!!.isEnabled = false
                    progressBarNine!!.progress = 0
                    textViewProgressNine!!.text = ""
                    progressBarNine!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarNine!!.progress = progressPercent.toInt()
                    textViewProgressNine!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonNine!!.isEnabled = false
                        buttonCancelNine!!.isEnabled = false
                        buttonNine!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonNine!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "9",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressNine!!.text = ""
                        progressBarNine!!.progress = 0
                        downloadIdNine = 0
                        buttonCancelNine!!.isEnabled = false
                        progressBarNine!!.isIndeterminate = false
                        buttonNine!!.isEnabled = true
                    }
                })
        })
        buttonCancelNine!!.setOnClickListener { Downloader.cancel(downloadIdNine) }
    }

    fun onClickListenerTen() {
        buttonTen!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdTen)) {
                Downloader.pause(downloadIdTen)
                return@OnClickListener
            }
            buttonTen!!.isEnabled = false
            progressBarTen!!.isIndeterminate = true
            progressBarTen!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdTen)) {
                Downloader.resume(downloadIdTen)
                return@OnClickListener
            }
            downloadIdTen = Downloader.download(urls[9], dirPath, "barcodescanner.apk")
                .build()
                .setOnStartOrResumeListener {
                    progressBarTen!!.isIndeterminate = false
                    buttonTen!!.isEnabled = true
                    buttonTen!!.setText(R.string.pause)
                    buttonCancelTen!!.isEnabled = true
                    buttonCancelTen!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonTen!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdTen = 0
                    buttonTen!!.setText(R.string.start)
                    buttonCancelTen!!.isEnabled = false
                    progressBarTen!!.progress = 0
                    textViewProgressTen!!.text = ""
                    progressBarTen!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarTen!!.progress = progressPercent.toInt()
                    textViewProgressTen!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonTen!!.isEnabled = false
                        buttonCancelTen!!.isEnabled = false
                        buttonTen!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonTen!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "10",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressTen!!.text = ""
                        progressBarTen!!.progress = 0
                        downloadIdTen = 0
                        buttonCancelTen!!.isEnabled = false
                        progressBarTen!!.isIndeterminate = false
                        buttonTen!!.isEnabled = true
                    }
                })
        })
        buttonCancelTen!!.setOnClickListener { Downloader.cancel(downloadIdTen) }
    }

    fun onClickListenerEleven() {
        buttonEleven!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdEleven)) {
                Downloader.pause(downloadIdEleven)
                return@OnClickListener
            }
            buttonEleven!!.isEnabled = false
            progressBarEleven!!.isIndeterminate = true
            progressBarEleven!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdEleven)) {
                Downloader.resume(downloadIdEleven)
                return@OnClickListener
            }
            downloadIdEleven = Downloader.download(urls[10], dirPath, "BigBuckBunny.m4v")
                .build()
                .setOnStartOrResumeListener {
                    progressBarEleven!!.isIndeterminate = false
                    buttonEleven!!.isEnabled = true
                    buttonEleven!!.setText(R.string.pause)
                    buttonCancelEleven!!.isEnabled = true
                    buttonCancelEleven!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonEleven!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdEleven = 0
                    buttonEleven!!.setText(R.string.start)
                    buttonCancelEleven!!.isEnabled = false
                    progressBarEleven!!.progress = 0
                    textViewProgressEleven!!.text = ""
                    progressBarEleven!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarEleven!!.progress = progressPercent.toInt()
                    textViewProgressEleven!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonEleven!!.isEnabled = false
                        buttonCancelEleven!!.isEnabled = false
                        buttonEleven!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonEleven!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "11",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressEleven!!.text = ""
                        progressBarEleven!!.progress = 0
                        downloadIdEleven = 0
                        buttonCancelEleven!!.isEnabled = false
                        progressBarEleven!!.isIndeterminate = false
                        buttonEleven!!.isEnabled = true
                    }
                })
        })
        buttonCancelEleven!!.setOnClickListener { Downloader.cancel(downloadIdEleven) }
    }

    fun onClickListenerTwelve() {
        buttonTwelve!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdTwelve)) {
                Downloader.pause(downloadIdTwelve)
                return@OnClickListener
            }
            buttonTwelve!!.isEnabled = false
            progressBarTwelve!!.isIndeterminate = true
            progressBarTwelve!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdTwelve)) {
                Downloader.resume(downloadIdTwelve)
                return@OnClickListener
            }
            downloadIdTwelve = Downloader.download(urls[11], dirPath, "harry-porter.pdf")
                .build()
                .setOnStartOrResumeListener {
                    progressBarTwelve!!.isIndeterminate = false
                    buttonTwelve!!.isEnabled = true
                    buttonTwelve!!.setText(R.string.pause)
                    buttonCancelTwelve!!.isEnabled = true
                    buttonCancelTwelve!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonTwelve!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdTwelve = 0
                    buttonTwelve!!.setText(R.string.start)
                    buttonCancelTwelve!!.isEnabled = false
                    progressBarTwelve!!.progress = 0
                    textViewProgressTwelve!!.text = ""
                    progressBarTwelve!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarTwelve!!.progress = progressPercent.toInt()
                    textViewProgressTwelve!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonTwelve!!.isEnabled = false
                        buttonCancelTwelve!!.isEnabled = false
                        buttonTwelve!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonTwelve!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "12",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressTwelve!!.text = ""
                        progressBarTwelve!!.progress = 0
                        downloadIdTwelve = 0
                        buttonCancelTwelve!!.isEnabled = false
                        progressBarTwelve!!.isIndeterminate = false
                        buttonTwelve!!.isEnabled = true
                    }
                })
        })
        buttonCancelTwelve!!.setOnClickListener { Downloader.cancel(downloadIdTwelve) }
    }

    fun onClickListenerThirteen() {
        buttonThirteen!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdThirteen)) {
                Downloader.pause(downloadIdThirteen)
                return@OnClickListener
            }
            buttonThirteen!!.isEnabled = false
            progressBarThirteen!!.isIndeterminate = true
            progressBarThirteen!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdThirteen)) {
                Downloader.resume(downloadIdThirteen)
                return@OnClickListener
            }
            downloadIdThirteen = Downloader.download(urls[12], dirPath, "giphy.gif")
                .build()
                .setOnStartOrResumeListener {
                    progressBarThirteen!!.isIndeterminate = false
                    buttonThirteen!!.isEnabled = true
                    buttonThirteen!!.setText(R.string.pause)
                    buttonCancelThirteen!!.isEnabled = true
                    buttonCancelThirteen!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonThirteen!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdThirteen = 0
                    buttonThirteen!!.setText(R.string.start)
                    buttonCancelThirteen!!.isEnabled = false
                    progressBarThirteen!!.progress = 0
                    textViewProgressThirteen!!.text = ""
                    progressBarThirteen!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarThirteen!!.progress = progressPercent.toInt()
                    textViewProgressThirteen!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonThirteen!!.isEnabled = false
                        buttonCancelThirteen!!.isEnabled = false
                        buttonThirteen!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonThirteen!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "13",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressThirteen!!.text = ""
                        progressBarThirteen!!.progress = 0
                        downloadIdThirteen = 0
                        buttonCancelThirteen!!.isEnabled = false
                        progressBarThirteen!!.isIndeterminate = false
                        buttonThirteen!!.isEnabled = true
                    }
                })
        })
        buttonCancelThirteen!!.setOnClickListener { Downloader.cancel(downloadIdThirteen) }
    }

    fun onClickListenerFourteen() {
        buttonFourteen!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdFourteen)) {
                Downloader.pause(downloadIdFourteen)
                return@OnClickListener
            }
            buttonFourteen!!.isEnabled = false
            progressBarFourteen!!.isIndeterminate = true
            progressBarFourteen!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdFourteen)) {
                Downloader.resume(downloadIdFourteen)
                return@OnClickListener
            }
            downloadIdFourteen = Downloader.download(urls[13], dirPath, "small.mp4")
                .build()
                .setOnStartOrResumeListener {
                    progressBarFourteen!!.isIndeterminate = false
                    buttonFourteen!!.isEnabled = true
                    buttonFourteen!!.setText(R.string.pause)
                    buttonCancelFourteen!!.isEnabled = true
                    buttonCancelFourteen!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonFourteen!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdFourteen = 0
                    buttonFourteen!!.setText(R.string.start)
                    buttonCancelFourteen!!.isEnabled = false
                    progressBarFourteen!!.progress = 0
                    textViewProgressFourteen!!.text = ""
                    progressBarFourteen!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarFourteen!!.progress = progressPercent.toInt()
                    textViewProgressFourteen!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonFourteen!!.isEnabled = false
                        buttonCancelFourteen!!.isEnabled = false
                        buttonFourteen!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonFourteen!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "14",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressFourteen!!.text = ""
                        progressBarFourteen!!.progress = 0
                        downloadIdFourteen = 0
                        buttonCancelFourteen!!.isEnabled = false
                        progressBarFourteen!!.isIndeterminate = false
                        buttonFourteen!!.isEnabled = true
                    }
                })
        })
        buttonCancelFourteen!!.setOnClickListener { Downloader.cancel(downloadIdFourteen) }
    }

    fun onClickListenerFifteen() {
        buttonFifteen!!.setOnClickListener(View.OnClickListener {
            if (Status.RUNNING == Downloader.getStatus(downloadIdFifteen)) {
                Downloader.pause(downloadIdFifteen)
                return@OnClickListener
            }
            buttonFifteen!!.isEnabled = false
            progressBarFifteen!!.isIndeterminate = true
            progressBarFifteen!!.indeterminateDrawable.setColorFilter(
                Color.BLUE, PorterDuff.Mode.SRC_IN
            )
            if (Status.PAUSED == Downloader.getStatus(downloadIdFifteen)) {
                Downloader.resume(downloadIdFifteen)
                return@OnClickListener
            }
            downloadIdFifteen = Downloader.download(urls[14], dirPath, "big_buck_bunny_720p_10mb.mp4")
                .build()
                .setOnStartOrResumeListener {
                    progressBarFifteen!!.isIndeterminate = false
                    buttonFifteen!!.isEnabled = true
                    buttonFifteen!!.setText(R.string.pause)
                    buttonCancelFifteen!!.isEnabled = true
                    buttonCancelFifteen!!.setText(R.string.cancel)
                }
                .setOnPauseListener { buttonFifteen!!.setText(R.string.resume) }
                .setOnCancelListener {
                    downloadIdFifteen = 0
                    buttonFifteen!!.setText(R.string.start)
                    buttonCancelFifteen!!.isEnabled = false
                    progressBarFifteen!!.progress = 0
                    textViewProgressFifteen!!.text = ""
                    progressBarFifteen!!.isIndeterminate = false
                }
                .setOnProgressListener { progress ->
                    val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                    progressBarFifteen!!.progress = progressPercent.toInt()
                    textViewProgressFifteen!!.text =
                        Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                }
                .start(object : OnDownloadListener {
                    override fun onDownloadComplete() {
                        buttonFifteen!!.isEnabled = false
                        buttonCancelFifteen!!.isEnabled = false
                        buttonFifteen!!.setText(R.string.completed)
                    }

                    override fun onError(error: Error) {
                        buttonFifteen!!.setText(R.string.start)
                        Toast.makeText(
                            applicationContext,
                            getString(R.string.some_error_occurred) + " " + "15",
                            Toast.LENGTH_SHORT
                        ).show()
                        textViewProgressFifteen!!.text = ""
                        progressBarFifteen!!.progress = 0
                        downloadIdFifteen = 0
                        buttonCancelFifteen!!.isEnabled = false
                        progressBarFifteen!!.isIndeterminate = false
                        buttonFifteen!!.isEnabled = true
                    }
                })
        })
        buttonCancelFifteen!!.setOnClickListener { Downloader.cancel(downloadIdFifteen) }
    }

    companion object {
        private lateinit var dirPath: String
    }
}