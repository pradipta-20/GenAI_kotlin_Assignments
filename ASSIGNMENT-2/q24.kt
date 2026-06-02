// Simulating a custom File object configuration
class File(val filename: String) {
    var permissions: String = "None"
}

fun buildFile(filename: String): File {
    // Instantiates a File, configures its internal state, logs, and returns it
    return File(filename).apply {
        // 'this' refers to the File instance; sets up properties
        permissions = "Read/Write"
    }.also {
        // 'it' refers to the File instance; performs side-effects like logging
        println("File ${it.filename} created")
    }
}

fun main() {
    val myFile = buildFile("assignment.txt")
    println("File configured with permissions: ${myFile.permissions}")
}