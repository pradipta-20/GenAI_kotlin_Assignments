fun main() {
    val fruits = listOf("apple", "banana")

    // The required one-liner transforming each string into its integer length
    val lengths = fruits.map { it.length }

    println(lengths) // Prints: [5, 6]
}