// WAP to generate Fibonacci series up to N terms using loops

fun main() {
    val n = 10
    var first = 0
    var second = 1

    print("Fibonacci series: ")
    for (i in 1..n) {
        print("$first ")
        val next = first + second
        first = second
        second = next
    }
}
