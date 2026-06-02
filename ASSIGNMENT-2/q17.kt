fun main() {
    val input: String? = "Kotlin"

    // The safe call operator ?. ensures the .let block runs ONLY if 'input' is not null
    input?.let {
        // 'it' represents the guaranteed non-null string inside this block
        println("The string length is: ${it.length}")
    }
}