// 1つ目: inline関数
inline fun inline(block: () -> Unit) = block()

// 2つ目: crossinline引数
inline fun crossInline(crossinline block: () -> Unit) = block()

// 3つ目: noinline引数/非inline関数
inline fun noinline(noinline block: () -> Unit) = block()
fun noninline(block: () -> Unit) = block()

// 4つ目: 関数インターフェース
fun funInterface(block: FunInterface) = block.call()
fun interface FunInterface {
    fun call()
}

// 5つ目: ラムダ式の直呼び出し
fun directLambdaCall() {
    ({
        println("raw lambda expression")
    })()
}
