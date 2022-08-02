//[downloader](../../../index.md)/[com.tamdevs.downloader.httpclient](../index.md)/[HttpClient](index.md)

# HttpClient

[androidJvm]\
public interface [HttpClient](index.md) implements [Cloneable](https://developer.android.com/reference/kotlin/java/lang/Cloneable.html)

## Functions

| Name | Summary |
|---|---|
| [clone](clone.md) | [androidJvm]<br>public abstract [HttpClient](index.md)[clone](clone.md)() |
| [close](close.md) | [androidJvm]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[close](close.md)() |
| [connect](connect.md) | [androidJvm]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[connect](connect.md)([DownloadRequest](../../com.tamdevs.downloader.request/-download-request/index.md)request) |
| [getContentLength](get-content-length.md) | [androidJvm]<br>public abstract [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)[getContentLength](get-content-length.md)() |
| [getErrorStream](get-error-stream.md) | [androidJvm]<br>public abstract [InputStream](https://developer.android.com/reference/kotlin/java/io/InputStream.html)[getErrorStream](get-error-stream.md)() |
| [getHeaderFields](get-header-fields.md) | [androidJvm]<br>public abstract [Map](https://developer.android.com/reference/kotlin/java/util/Map.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html), [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[String](https://developer.android.com/reference/kotlin/java/lang/String.html)&gt;&gt;[getHeaderFields](get-header-fields.md)() |
| [getInputStream](get-input-stream.md) | [androidJvm]<br>public abstract [InputStream](https://developer.android.com/reference/kotlin/java/io/InputStream.html)[getInputStream](get-input-stream.md)() |
| [getResponseCode](get-response-code.md) | [androidJvm]<br>public abstract [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)[getResponseCode](get-response-code.md)() |
| [getResponseHeader](get-response-header.md) | [androidJvm]<br>public abstract [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getResponseHeader](get-response-header.md)([String](https://developer.android.com/reference/kotlin/java/lang/String.html)name) |

## Inheritors

| Name |
|---|
| [DefaultHttpClient](../-default-http-client/index.md) |
