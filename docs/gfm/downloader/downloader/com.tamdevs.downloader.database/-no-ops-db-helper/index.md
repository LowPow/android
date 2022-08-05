//[downloader](../../../index.md)/[com.tamdevs.downloader.database](../index.md)/[NoOpsDbHelper](index.md)

# NoOpsDbHelper

[androidJvm]\
public final class [NoOpsDbHelper](index.md) implements [DbHelper](../-db-helper/index.md)

## Constructors

| | |
|---|---|
| [NoOpsDbHelper](-no-ops-db-helper.md) | [androidJvm]<br>public [NoOpsDbHelper](index.md)[NoOpsDbHelper](-no-ops-db-helper.md)() |

## Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[clear](clear.md)() |
| [find](find.md) | [androidJvm]<br>public [DownloadModel](../-download-model/index.md)[find](find.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)id) |
| [getUnwantedModels](get-unwanted-models.md) | [androidJvm]<br>public [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[DownloadModel](../-download-model/index.md)&gt;[getUnwantedModels](get-unwanted-models.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)days) |
| [insert](insert.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[insert](insert.md)([DownloadModel](../-download-model/index.md)model) |
| [remove](remove.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[remove](remove.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)id) |
| [update](update.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[update](update.md)([DownloadModel](../-download-model/index.md)model) |
| [updateProgress](update-progress.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[updateProgress](update-progress.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)id, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)downloadedBytes, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)lastModifiedAt) |
