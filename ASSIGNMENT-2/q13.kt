fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // checking if a number is divisible by 2
    val evenNumbers = numbers.filter { it % 2 == 0 }

    println(evenNumbers) // Prints: [2, 4]
}