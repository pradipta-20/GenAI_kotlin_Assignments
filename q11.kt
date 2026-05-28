// WAP to find the sum of digits of a number

fun main() {
    var number = 1234
    var sum = 0

    while (number != 0) {
        sum += number % 10   // add last digit to sum
        number /= 10
    }

    println("Sum of digits: $sum")
}
