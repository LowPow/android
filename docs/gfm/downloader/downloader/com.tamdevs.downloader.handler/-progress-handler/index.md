//[downloader](../../../index.md)/[com.tamdevs.downloader.handler](../index.md)/[ProgressHandler](index.md)

# ProgressHandler

[androidJvm]\
public final class [ProgressHandler](index.md) extends [Handler](https://developer.android.com/reference/kotlin/android/os/Handler.html)

## Constructors

| | |
|---|---|
| [ProgressHandler](-progress-handler.md) | [androidJvm]<br>public [ProgressHandler](index.md)[ProgressHandler](-progress-handler.md)([OnProgressListener](../../com.tamdevs.downloader/-on-progress-listener/index.md)listener) |

## Functions

| Name | Summary |
|---|---|
| [dispatchMessage](index.md#-226320379%2FFunctions%2F1725225430) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[dispatchMessage](index.md#-226320379%2FFunctions%2F1725225430)([Message](https://developer.android.com/reference/kotlin/android/os/Message.html)p0) |
| [dump](index.md#1891723056%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[dump](index.md#1891723056%2FFunctions%2F1725225430)([Printer](https://developer.android.com/reference/kotlin/android/util/Printer.html)p0, [String](https://developer.android.com/reference/kotlin/java/lang/String.html)p1) |
| [getLooper](index.md#-236168921%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Looper](https://developer.android.com/reference/kotlin/android/os/Looper.html)[getLooper](index.md#-236168921%2FFunctions%2F1725225430)() |
| [getMessageName](index.md#-316354796%2FFunctions%2F1725225430) | [androidJvm]<br>public [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[getMessageName](index.md#-316354796%2FFunctions%2F1725225430)([Message](https://developer.android.com/reference/kotlin/android/os/Message.html)p0) |
| [handleMessage](handle-message.md) | [androidJvm]<br>public [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[handleMessage](handle-message.md)([Message](https://developer.android.com/reference/kotlin/android/os/Message.html)msg) |
| [hasCallbacks](index.md#265332007%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[hasCallbacks](index.md#265332007%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0) |
| [hasMessages](index.md#152034470%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[hasMessages](index.md#152034470%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0)<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[hasMessages](index.md#1418015689%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p1) |
| [obtainMessage](index.md#297094828%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Message](https://developer.android.com/reference/kotlin/android/os/Message.html)[obtainMessage](index.md#297094828%2FFunctions%2F1725225430)()<br>public final [Message](https://developer.android.com/reference/kotlin/android/os/Message.html)[obtainMessage](index.md#-1430658742%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0)<br>public final [Message](https://developer.android.com/reference/kotlin/android/os/Message.html)[obtainMessage](index.md#-1623629203%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p1)<br>public final [Message](https://developer.android.com/reference/kotlin/android/os/Message.html)[obtainMessage](index.md#1215717802%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p1, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p2)<br>public final [Message](https://developer.android.com/reference/kotlin/android/os/Message.html)[obtainMessage](index.md#2002277069%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p1, [Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p2, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p3) |
| [post](index.md#86194011%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[post](index.md#86194011%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0) |
| [postAtFrontOfQueue](index.md#535180183%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[postAtFrontOfQueue](index.md#535180183%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0) |
| [postAtTime](index.md#-370306763%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[postAtTime](index.md#-370306763%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p1)<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[postAtTime](index.md#35497048%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p1, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p2) |
| [postDelayed](index.md#872505461%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[postDelayed](index.md#872505461%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p1)<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[postDelayed](index.md#1521783704%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p1, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p2) |
| [removeCallbacks](index.md#841258003%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[removeCallbacks](index.md#841258003%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0)<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[removeCallbacks](index.md#-1224134730%2FFunctions%2F1725225430)([Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)p0, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p1) |
| [removeCallbacksAndMessages](index.md#-807102929%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[removeCallbacksAndMessages](index.md#-807102929%2FFunctions%2F1725225430)([Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p0) |
| [removeMessages](index.md#939734074%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[removeMessages](index.md#939734074%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0)<br>public final [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)[removeMessages](index.md#435015005%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0, [Object](https://developer.android.com/reference/kotlin/java/lang/Object.html)p1) |
| [sendEmptyMessage](index.md#-2032660600%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[sendEmptyMessage](index.md#-2032660600%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0) |
| [sendEmptyMessageAtTime](index.md#763160418%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[sendEmptyMessageAtTime](index.md#763160418%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p1) |
| [sendEmptyMessageDelayed](index.md#587109094%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[sendEmptyMessageDelayed](index.md#587109094%2FFunctions%2F1725225430)([Integer](https://developer.android.com/reference/kotlin/java/lang/Integer.html)p0, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p1) |
| [sendMessage](index.md#1476762643%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[sendMessage](index.md#1476762643%2FFunctions%2F1725225430)([Message](https://developer.android.com/reference/kotlin/android/os/Message.html)p0) |
| [sendMessageAtFrontOfQueue](index.md#-1405784305%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[sendMessageAtFrontOfQueue](index.md#-1405784305%2FFunctions%2F1725225430)([Message](https://developer.android.com/reference/kotlin/android/os/Message.html)p0) |
| [sendMessageAtTime](index.md#-1745572947%2FFunctions%2F1725225430) | [androidJvm]<br>public [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[sendMessageAtTime](index.md#-1745572947%2FFunctions%2F1725225430)([Message](https://developer.android.com/reference/kotlin/android/os/Message.html)p0, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p1) |
| [sendMessageDelayed](index.md#-426717689%2FFunctions%2F1725225430) | [androidJvm]<br>public final [Boolean](https://developer.android.com/reference/kotlin/java/lang/Boolean.html)[sendMessageDelayed](index.md#-426717689%2FFunctions%2F1725225430)([Message](https://developer.android.com/reference/kotlin/android/os/Message.html)p0, [Long](https://developer.android.com/reference/kotlin/java/lang/Long.html)p1) |
| [toString](index.md#543776736%2FFunctions%2F1725225430) | [androidJvm]<br>public [String](https://developer.android.com/reference/kotlin/java/lang/String.html)[toString](index.md#543776736%2FFunctions%2F1725225430)() |