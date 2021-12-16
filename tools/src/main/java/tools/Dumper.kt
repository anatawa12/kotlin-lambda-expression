import java.io.*
import org.objectweb.asm.*
import org.objectweb.asm.util.*

fun main(args: Array<String>) {
    for (arg in args)
        dumpClassFile(File(arg))
}

fun dumpClassFile(file: File) {
    val bytes = file.readBytes()
    val reader = ClassReader(bytes)
    val writer = PrintWriter(System.out, true)
    reader.accept(TraceClassVisitor(writer), 0)
    writer.flush()
}
