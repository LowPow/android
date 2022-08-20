//[downloader](../../../index.md)/[com.tamdevs.downloader.request](../index.md)/[DownloadRequest](index.md)

# DownloadRequest

[androidJvm]\
public final class [DownloadRequest](index.md)

## Functions

| Name | Summary |
|---|---|
| [cancel](cancel.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[cancel](cancel.md)() |
| [deliverError](deliver-error.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[deliverError](deliver-error.md)([Error](../../com.tamdevs.downloader/-error/index.md)error) |
| [deliverPauseEvent](deliver-pause-event.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[deliverPauseEvent](deliver-pause-event.md)() |
| [deliverStartEvent](deliver-start-event.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[deliverStartEvent](deliver-start-event.md)() |
| [deliverSuccess](deliver-success.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[deliverSuccess](deliver-success.md)() |
| [executeSync](execute-sync.md) | [androidJvm]<br>public final [Response](../../com.tamdevs.downloader/-response/index.md)[executeSync](execute-sync.md)() |
| [getConnectTimeout](get-connect-timeout.md) | [androidJvm]<br>public final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getConnectTimeout](get-connect-timeout.md)() |
| [getDirPath](get-dir-path.md) | [androidJvm]<br>public final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getDirPath](get-dir-path.md)() |
| [getDownloadedBytes](get-downloaded-bytes.md) | [androidJvm]<br>public final [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)[getDownloadedBytes](get-downloaded-bytes.md)() |
| [getDownloadId](get-download-id.md) | [androidJvm]<br>public final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getDownloadId](get-download-id.md)() |
| [getFileName](get-file-name.md) | [androidJvm]<br>public final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getFileName](get-file-name.md)() |
| [getFuture](get-future.md) | [androidJvm]<br>public final [Future](https://developer.android.com/reference/kotlin/java/util/concurrent/Future.html)&lt;?&gt;[getFuture](get-future.md)() |
| [getHeaders](get-headers.md) | [androidJvm]<br>public final [HashMap](https://developer.android.com/reference/kotlin/java/util/HashMap.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;&gt;[getHeaders](get-headers.md)() |
| [getOnProgressListener](get-on-progress-listener.md) | [androidJvm]<br>public final [OnProgressListener](../../com.tamdevs.downloader/-on-progress-listener/index.md)[getOnProgressListener](get-on-progress-listener.md)() |
| [getPriority](get-priority.md) | [androidJvm]<br>public final [Priority](../../com.tamdevs.downloader/-priority/index.md)[getPriority](get-priority.md)() |
| [getReadTimeout](get-read-timeout.md) | [androidJvm]<br>public final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getReadTimeout](get-read-timeout.md)() |
| [getSequenceNumber](get-sequence-number.md) | [androidJvm]<br>public final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getSequenceNumber](get-sequence-number.md)() |
| [getStatus](get-status.md) | [androidJvm]<br>public final [Status](../../com.tamdevs.downloader/-status/index.md)[getStatus](get-status.md)() |
| [getTag](get-tag.md) | [androidJvm]<br>public final [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)[getTag](get-tag.md)() |
| [getTotalBytes](get-total-bytes.md) | [androidJvm]<br>public final [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)[getTotalBytes](get-total-bytes.md)() |
| [getUrl](get-url.md) | [androidJvm]<br>public final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getUrl](get-url.md)() |
| [getUserAgent](get-user-agent.md) | [androidJvm]<br>public final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getUserAgent](get-user-agent.md)() |
| [getUserAgent1](get-user-agent1.md) | [androidJvm]<br>public final [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getUserAgent1](get-user-agent1.md)() |
| [setConnectTimeout](set-connect-timeout.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setConnectTimeout](set-connect-timeout.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)connectTimeout) |
| [setDirPath](set-dir-path.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setDirPath](set-dir-path.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)dirPath) |
| [setDownloadedBytes](set-downloaded-bytes.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setDownloadedBytes](set-downloaded-bytes.md)([Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)downloadedBytes) |
| [setDownloadId](set-download-id.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setDownloadId](set-download-id.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)downloadId) |
| [setFileName](set-file-name.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setFileName](set-file-name.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)fileName) |
| [setFuture](set-future.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setFuture](set-future.md)([Future](https://developer.android.com/reference/kotlin/java/util/concurrent/Future.html)&lt;?&gt;future) |
| [setOnCancelListener](set-on-cancel-listener.md) | [androidJvm]<br>public final [DownloadRequest](index.md)[setOnCancelListener](set-on-cancel-listener.md)([OnCancelListener](../../com.tamdevs.downloader/-on-cancel-listener/index.md)onCancelListener) |
| [setOnPauseListener](set-on-pause-listener.md) | [androidJvm]<br>public final [DownloadRequest](index.md)[setOnPauseListener](set-on-pause-listener.md)([OnPauseListener](../../com.tamdevs.downloader/-on-pause-listener/index.md)onPauseListener) |
| [setOnProgressListener](set-on-progress-listener.md) | [androidJvm]<br>public final [DownloadRequest](index.md)[setOnProgressListener](set-on-progress-listener.md)([OnProgressListener](../../com.tamdevs.downloader/-on-progress-listener/index.md)onProgressListener) |
| [setOnStartOrResumeListener](set-on-start-or-resume-listener.md) | [androidJvm]<br>public final [DownloadRequest](index.md)[setOnStartOrResumeListener](set-on-start-or-resume-listener.md)([OnStartOrResumeListener](../../com.tamdevs.downloader/-on-start-or-resume-listener/index.md)onStartOrResumeListener) |
| [setPriority](set-priority.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setPriority](set-priority.md)([Priority](../../com.tamdevs.downloader/-priority/index.md)priority) |
| [setReadTimeout](set-read-timeout.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setReadTimeout](set-read-timeout.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)readTimeout) |
| [setSequenceNumber](set-sequence-number.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setSequenceNumber](set-sequence-number.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)sequenceNumber) |
| [setStatus](set-status.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setStatus](set-status.md)([Status](../../com.tamdevs.downloader/-status/index.md)status) |
| [setTag](set-tag.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setTag](set-tag.md)([Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)tag) |
| [setTotalBytes](set-total-bytes.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setTotalBytes](set-total-bytes.md)([Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)totalBytes) |
| [setUrl](set-url.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setUrl](set-url.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)url) |
| [setUserAgent](set-user-agent.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setUserAgent](set-user-agent.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)userAgent) |
| [setUserAgent1](set-user-agent1.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setUserAgent1](set-user-agent1.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)userAgent) |
| [start](start.md) | [androidJvm]<br>public final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[start](start.md)([OnDownloadListener](../../com.tamdevs.downloader/-on-download-listener/index.md)onDownloadListener) |

## Properties

| Name | Summary |
|---|---|
| [connectTimeout](index.md#1182588386%2FProperties%2F1725225430) | [androidJvm]<br>private [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[connectTimeout](index.md#1182588386%2FProperties%2F1725225430) |
| [dirPath](index.md#664891855%2FProperties%2F1725225430) | [androidJvm]<br>private [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[dirPath](index.md#664891855%2FProperties%2F1725225430) |
| [downloadedBytes](index.md#1501928157%2FProperties%2F1725225430) | [androidJvm]<br>private [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)[downloadedBytes](index.md#1501928157%2FProperties%2F1725225430) |
| [downloadId](index.md#-153934154%2FProperties%2F1725225430) | [androidJvm]<br>private [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[downloadId](index.md#-153934154%2FProperties%2F1725225430) |
| [fileName](index.md#-896659502%2FProperties%2F1725225430) | [androidJvm]<br>private [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[fileName](index.md#-896659502%2FProperties%2F1725225430) |
| [future](index.md#-1590085962%2FProperties%2F1725225430) | [androidJvm]<br>private [Future](https://developer.android.com/reference/kotlin/java/util/concurrent/Future.html)&lt;?&gt;[future](index.md#-1590085962%2FProperties%2F1725225430) |
| [headers](index.md#-2004987109%2FProperties%2F1725225430) | [androidJvm]<br>private final [HashMap](https://developer.android.com/reference/kotlin/java/util/HashMap.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;&gt;[headers](index.md#-2004987109%2FProperties%2F1725225430) |
| [onProgressListener](index.md#758761241%2FProperties%2F1725225430) | [androidJvm]<br>private final [OnProgressListener](../../com.tamdevs.downloader/-on-progress-listener/index.md)[onProgressListener](index.md#758761241%2FProperties%2F1725225430) |
| [priority](index.md#1386762997%2FProperties%2F1725225430) | [androidJvm]<br>private [Priority](../../com.tamdevs.downloader/-priority/index.md)[priority](index.md#1386762997%2FProperties%2F1725225430) |
| [readTimeout](index.md#-344849066%2FProperties%2F1725225430) | [androidJvm]<br>private [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[readTimeout](index.md#-344849066%2FProperties%2F1725225430) |
| [sequenceNumber](index.md#171489263%2FProperties%2F1725225430) | [androidJvm]<br>private [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[sequenceNumber](index.md#171489263%2FProperties%2F1725225430) |
| [status](index.md#1953855335%2FProperties%2F1725225430) | [androidJvm]<br>private [Status](../../com.tamdevs.downloader/-status/index.md)[status](index.md#1953855335%2FProperties%2F1725225430) |
| [tag](index.md#1719939975%2FProperties%2F1725225430) | [androidJvm]<br>private [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)[tag](index.md#1719939975%2FProperties%2F1725225430) |
| [totalBytes](index.md#791812978%2FProperties%2F1725225430) | [androidJvm]<br>private [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)[totalBytes](index.md#791812978%2FProperties%2F1725225430) |
| [url](index.md#787871570%2FProperties%2F1725225430) | [androidJvm]<br>private [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[url](index.md#787871570%2FProperties%2F1725225430) |
| [userAgent](index.md#681485863%2FProperties%2F1725225430) | [androidJvm]<br>private [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[userAgent](index.md#681485863%2FProperties%2F1725225430) |
