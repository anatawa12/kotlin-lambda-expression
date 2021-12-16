@file:JvmName("Core")
inline fun inline(block: () -> Unit) = block()
inline fun crossInline(crossinline block: () -> Unit) = block()
@Suppress("NOTHING_TO_INLINE")
inline fun noinline(noinline block: () -> Unit) = block()

fun caller(): Int {
    inline {
        return 0
    }
    crossInline {
        return 0
    }
    noinline {
        return 0
    }
    error("")
}
