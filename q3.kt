// WAP to find the sum of all numbers from 1 to N using a function

fun sumUpToN(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    val n = 10
    val result = sumUpToN(n)
    println("Sum from 1 to $n = $result")
}
