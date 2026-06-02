// Prefixing the function name with 'String.' injects this new behavior into the standard String class
fun String.addExclamation(): String {
    // 'this' refers to the actual value of the string object calling the function
    return this + "!"
}

fun main() {
    val originalText = "Hello"
    
    // Testing the extension function
    val excitedText = originalText.addExclamation()
    println(excitedText) // Prints: Hello!
}