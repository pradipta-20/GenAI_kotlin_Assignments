// WAP to swap two numbers without using a third variable

fun main() {
    var a = 10
    var b = 20

    a = a + b
    b = a - b   // gives original a
    a = a - b   // gives original b

    println("After swapping: a = $a, b = $b")
}
