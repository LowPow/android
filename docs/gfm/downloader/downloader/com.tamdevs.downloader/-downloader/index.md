//[downloader](../../../index.md)/[com.tamdevs.downloader](../index.md)/[Downloader](index.md)

# Downloader

[androidJvm]\
public class [Downloader](index.md)

Downloader entry point. You must initialize this class before use. The simplest way is to just do {#code Downloader.initialize(context)}.

## Functions

| Name | Summary |
|---|---|
| [cancel](cancel.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[cancel](cancel.md)([Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)tag)<br>Method to cancel requests with the given tag<br>[androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[cancel](cancel.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)downloadId)<br>Method to cancel request with the given downloadId |
| [cancelAll](cancel-all.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[cancelAll](cancel-all.md)()<br>Method to cancel all requests |
| [cleanUp](clean-up.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[cleanUp](clean-up.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)days)<br>Method to clean up temporary resumed files which is older than the given day |
| [download](download.md) | [androidJvm]<br>public final [DownloadRequestBuilder](../../com.tamdevs.downloader.request/-download-request-builder/index.md)[download](download.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)url, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)dirPath, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)fileName)<br>Method to make download request |
| [getStatus](get-status.md) | [androidJvm]<br>public final [Status](../-status/index.md)[getStatus](get-status.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)downloadId)<br>Method to check the request with the given downloadId is running or not |
| [initialize](initialize.md) | [androidJvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[initialize](initialize.md)([Context](https://developer.android.com/reference/kotlin/android/content/Context.html)context)<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[initialize](initialize.md)([Context](https://developer.android.com/reference/kotlin/android/content/Context.html)context, [DownloaderConfig](../-downloader-config/index.md)config)<br>Initializes Downloader with the custom config. |
| [pause](pause.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[pause](pause.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)downloadId)<br>Method to pause request with the given downloadId |
| [resume](resume.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[resume](resume.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)downloadId)<br>Method to resume request with the given downloadId |
| [shutDown](shut-down.md) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[shutDown](shut-down.md)()<br>Shuts Downloader down |

## Properties

| Name | Summary |
|---|---|
| [INSTANCE](index.md#399555947%2FProperties%2F1725225430) | [androidJvm]<br>public final static [Downloader](index.md)[INSTANCE](index.md#399555947%2FProperties%2F1725225430) |
