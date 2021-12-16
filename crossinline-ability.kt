@file:JvmName("Core")
/*
inline fun inline(block: () -> Unit) = object : SomeHandler() {
    override fun handle() = block()
}
// */
inline fun crossInline(crossinline block: () -> Unit) = object : SomeHandler() {
    override fun handle() = block()
}
fun caller() {
    crossInline { println("crossInline") }
}

abstract class SomeHandler {
    abstract fun handle()
}
