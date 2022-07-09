package com.sample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.tamdevs.downloader.Downloader
import com.tamdevs.downloader.Error
import com.tamdevs.downloader.OnDownloadListener
import com.tamdevs.downloader.Status
import com.sample.data.constant.Constant.downloadFiles
import com.sample.utils.Utils

class MainActivity : AppCompatActivity() {


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dirPath = Utils.getRootDirPath(applicationContext)
        setContent {
            MaterialTheme {
                Surface {
                    val downloadFiles by rememberSaveable {
                        mutableStateOf(downloadFiles)
                    }
                    LazyColumn {
                        itemsIndexed(downloadFiles) { index, item ->

                            var isDownloadEnabled by rememberSaveable { mutableStateOf(true) }
                            var isCancelEnabled by rememberSaveable { mutableStateOf(false) }
                            var isIndeterminate: Boolean? by rememberSaveable { mutableStateOf(null) }
                            var downloadText by rememberSaveable { mutableStateOf("Download") }
                            var downloadProgress by rememberSaveable { mutableStateOf(0.0f) }
                            var downloadProgressText by rememberSaveable { mutableStateOf("") }

                            Card(
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                                    .fillMaxWidth(),
                                elevation = CardDefaults.elevatedCardElevation()
                            ) {
                                Column(modifier = Modifier.padding(8.dp)) {
                                    Text(item.fileName)
                                    if (isIndeterminate == true) {
                                        LinearProgressIndicator(
                                            color = Color.Blue
                                        )
                                    } else if (isIndeterminate == false) {
                                        LinearProgressIndicator(
                                            progress = downloadProgress,
                                        )
                                    }
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.End,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(downloadProgressText)
                                        TextButton(
                                            enabled = isCancelEnabled,
                                            onClick = {
                                                Downloader.cancel(downloadFiles[index].downloadId)
                                            }) {
                                            Text(stringResource(R.string.cancel))
                                        }
                                        Button(
                                            enabled = isDownloadEnabled,
                                            onClick = {
                                                if (Status.RUNNING == Downloader.getStatus(
                                                        downloadFiles[index].downloadId
                                                    )
                                                ) {
                                                    Downloader.pause(downloadFiles[index].downloadId)
                                                    return@Button
                                                }
                                                isDownloadEnabled = false
                                                isIndeterminate = true

                                                if (Status.PAUSED == Downloader.getStatus(
                                                        downloadFiles[index].downloadId
                                                    )
                                                ) {
                                                    Downloader.resume(downloadFiles[index].downloadId)
                                                    return@Button
                                                }
                                                downloadFiles[index].downloadId =
                                                    Downloader.download(
                                                        item.url,
                                                        dirPath,
                                                        item.fileName,
                                                    )
                                                        .build()
                                                        .setOnStartOrResumeListener {
                                                            isIndeterminate = false
                                                            isDownloadEnabled = true
                                                            downloadText = getString(R.string.pause)
                                                            isCancelEnabled = true
                                                        }
                                                        .setOnPauseListener {
                                                            downloadText =
                                                                getString(R.string.resume)
                                                        }
                                                        .setOnCancelListener {
                                                            downloadText = getString(R.string.start)
                                                            isCancelEnabled = false
                                                            downloadProgress = 0.0f
                                                            downloadProgressText = ""
                                                            downloadFiles[index].downloadId = 0
                                                            isIndeterminate = null
                                                        }
                                                        .setOnProgressListener { progress ->
                                                            val progressPercent =
                                                                progress.currentBytes.toFloat() / progress.totalBytes.toFloat()
                                                            downloadProgress = progressPercent
                                                            downloadProgressText =
                                                                Utils.getProgressDisplayLine(
                                                                    progress.currentBytes,
                                                                    progress.totalBytes
                                                                )
                                                            isIndeterminate = false
                                                        }
                                                        .start(object : OnDownloadListener {
                                                            override fun onDownloadComplete() {
                                                                isDownloadEnabled = false
                                                                isCancelEnabled = false
                                                                downloadText =
                                                                    getString(R.string.completed)
                                                            }

                                                            override fun onError(error: Error) {
                                                                downloadText =
                                                                    getString(R.string.start)
                                                                Toast.makeText(
                                                                    applicationContext,
                                                                    error.toString(),
                                                                    Toast.LENGTH_SHORT
                                                                ).show()
                                                                downloadProgressText = ""
                                                                downloadProgress = 0.0f
                                                                downloadFiles[index].downloadId = 0
                                                                isCancelEnabled = false
                                                                isIndeterminate = null
                                                                isDownloadEnabled = true
                                                            }
                                                        })

                                            }) {
                                            Text(downloadText)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    companion object {
        private lateinit var dirPath: String
    }
}