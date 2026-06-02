// WAP to find the factorial of a number using a loop

fun main() {
    val number = 5
    var factorial = 1

    for (i in 1..number) {
        factorial *= i
    }

    println("Factorial of $number = $factorial")
}
