//[downloader](../../../index.md)/[com.tamdevs.downloader.internal.stream](../index.md)/[FileDownloadRandomAccessFile](index.md)

# FileDownloadRandomAccessFile

[androidJvm]\
public final class [FileDownloadRandomAccessFile](index.md) implements [FileDownloadOutputStream](../-file-download-output-stream/index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>public class [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [close](close.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[close](close.md)()<br>Closes this output stream and releases any system resources associated with this stream. The general contract of `close` is that it closes the output stream. A closed stream cannot perform output operations and cannot be reopened. |
| [flushAndSync](flush-and-sync.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[flushAndSync](flush-and-sync.md)()<br>Flush all buffer to system and force all system buffers to synchronize with the underlying device. |
| [seek](seek.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[seek](seek.md)([Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)offset)<br>Sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.  The offset may be set beyond the end of the file. |
| [setLength](set-length.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[setLength](set-length.md)([Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)newLength)<br>Sets the length of this file. |
| [write](write.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[write](write.md)([ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)b, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)off, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)len)<br>Writes `len` bytes from the specified byte array starting at offset `off` to this file. |
