// WAP to reverse a given number using loops

fun main() {
    var number = 12345
    var reversed = 0

    while (number != 0) {
        val digit = number % 10   // extract last digit
        reversed = reversed * 10 + digit
        number /= 10              // remove last digit
    }

    println("Reversed number: $reversed")
}
