//[downloader](../../../index.md)/[com.tamdevs.downloader.database](../index.md)/[DbHelper](index.md)

# DbHelper

[androidJvm]\
public interface [DbHelper](index.md)

## Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | [androidJvm]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[clear](clear.md)() |
| [find](find.md) | [androidJvm]<br>public abstract [DownloadModel](../-download-model/index.md)[find](find.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)id) |
| [getUnwantedModels](get-unwanted-models.md) | [androidJvm]<br>public abstract [List](https://developer.android.com/reference/kotlin/java/util/List.html)&lt;[DownloadModel](../-download-model/index.md)&gt;[getUnwantedModels](get-unwanted-models.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)days) |
| [insert](insert.md) | [androidJvm]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[insert](insert.md)([DownloadModel](../-download-model/index.md)model) |
| [remove](remove.md) | [androidJvm]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[remove](remove.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)id) |
| [update](update.md) | [androidJvm]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[update](update.md)([DownloadModel](../-download-model/index.md)model) |
| [updateProgress](update-progress.md) | [androidJvm]<br>public abstract [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[updateProgress](update-progress.md)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)id, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)downloadedBytes, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)lastModifiedAt) |

## Inheritors

| Name |
|---|
| [AppDbHelper](../-app-db-helper/index.md) |
| [NoOpsDbHelper](../-no-ops-db-helper/index.md) |
