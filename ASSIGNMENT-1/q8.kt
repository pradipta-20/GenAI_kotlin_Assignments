// WAP to count the number of digits in a given integer

fun main() {
    var number = 94561
    var count = 0

    while (number != 0) {
        number /= 10   // remove last digit
        count++
    }

    println("Number of digits: $count")
}
