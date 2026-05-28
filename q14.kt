// WAP to print all prime numbers from 1 to N

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..n / 2) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val n = 50

    print("Prime numbers from 1 to $n: ")
    for (i in 1..n) {
        if (isPrime(i)) print("$i ")
    }
}
