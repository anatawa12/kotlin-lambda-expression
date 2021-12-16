@file:JvmName("Core")

fun callInline() {
    inline { println("inline") }
}

fun callCrossInline() {
    crossInline { println("crossInline") }
}

fun callNoinline() {
    noinline { println("noinline") }
}

fun callNoninline() {
    noninline { println("noinline") }
}

fun callFunInterface() {
    funInterface { println("funInterface") }
}

fun callLambdaDirectly() {
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
