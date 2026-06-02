val square: (Int) -> Int = { 
    // 'it' refers automatically to the single input integer passed to the lambda
    it * it 
}

fun main() {
    val result = square(5)
    println(result) // Prints: 25
}