//[downloader](../../../index.md)/[com.tamdevs.downloader.httpclient](../index.md)/[DefaultHttpClient](index.md)

# DefaultHttpClient

[androidJvm]\
public final class [DefaultHttpClient](index.md) implements [HttpClient](../-http-client/index.md)

## Constructors

| | |
|---|---|
| [DefaultHttpClient](-default-http-client.md) | [androidJvm]<br>public [DefaultHttpClient](index.md)[DefaultHttpClient](-default-http-client.md)() |

## Functions

| Name | Summary |
|---|---|
| [clone](clone.md) | [androidJvm]<br>public [HttpClient](../-http-client/index.md)[clone](clone.md)() |
| [close](close.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[close](close.md)() |
| [connect](connect.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[connect](connect.md)([DownloadRequest](../../com.tamdevs.downloader.request/-download-request/index.md)request) |
| [getContentLength](get-content-length.md) | [androidJvm]<br>public [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)[getContentLength](get-content-length.md)() |
| [getErrorStream](get-error-stream.md) | [androidJvm]<br>public [InputStream](https://developer.android.com/reference/kotlin/java/io/InputStream.html)[getErrorStream](get-error-stream.md)() |
| [getHeaderFields](get-header-fields.md) | [androidJvm]<br>public [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;&gt;[getHeaderFields](get-header-fields.md)() |
| [getInputStream](get-input-stream.md) | [androidJvm]<br>public [InputStream](https://developer.android.com/reference/kotlin/java/io/InputStream.html)[getInputStream](get-input-stream.md)() |
| [getResponseCode](get-response-code.md) | [androidJvm]<br>public [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getResponseCode](get-response-code.md)() |
| [getResponseHeader](get-response-header.md) | [androidJvm]<br>public [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getResponseHeader](get-response-header.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)name) |

## Properties

| Name | Summary |
|---|---|
| [contentLength](index.md#-544544455%2FProperties%2F1725225430) | [androidJvm]<br>private final [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)[contentLength](index.md#-544544455%2FProperties%2F1725225430) |
| [errorStream](index.md#350118192%2FProperties%2F1725225430) | [androidJvm]<br>private final [InputStream](https://developer.android.com/reference/kotlin/java/io/InputStream.html)[errorStream](index.md#350118192%2FProperties%2F1725225430) |
| [headerFields](index.md#1785153052%2FProperties%2F1725225430) | [androidJvm]<br>private final [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;&gt;[headerFields](index.md#1785153052%2FProperties%2F1725225430) |
| [inputStream](index.md#-743988434%2FProperties%2F1725225430) | [androidJvm]<br>private final [InputStream](https://developer.android.com/reference/kotlin/java/io/InputStream.html)[inputStream](index.md#-743988434%2FProperties%2F1725225430) |
| [responseCode](index.md#-141998860%2FProperties%2F1725225430) | [androidJvm]<br>private final [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[responseCode](index.md#-141998860%2FProperties%2F1725225430) |
