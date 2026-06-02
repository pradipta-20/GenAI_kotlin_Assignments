class IDGenerator {
    // Elements inside a companion object can be accessed using just the class name
    companion object {
        var currentId: Int = 0

        fun getNextId(): Int {
            currentId++ // Increment the count
            return currentId
        }
    }
}

fun main() {
    // Accessed directly via the class name, acting like static members in other languages
    println(IDGenerator.getNextId()) // Prints 1
    println(IDGenerator.getNextId()) // Prints 2
}