@file:JvmName("Core")

fun caller() {
    // 1つ目: inline関数
    inline { println("inline") }
    // 2つ目: crossinline引数
    crossInline { println("crossInline") }
    // 3つ目: noinline引数/非inline関数
    noinline { println("noinline") }
    noninline { println("noinline") }
    // 4つ目: 関数インターフェース
    funInterface { println("funInterface") }
    // 5つ目: ラムダ式の直呼び出し
    ({
        println("raw lambda expression")
    })()
}

inline fun inline(block: () -> Unit) = block()
inline fun crossInline(crossinline block: () -> Unit) = block()
inline fun noinline(noinline block: () -> Unit) = block()
fun noninline(block: () -> Unit) = block()
fun funInterface(block: FunInterface) = block.call()

fun interface FunInterface {
    fun call()
}
