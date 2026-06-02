// WAP to swap two numbers using a third variable

fun main() {
    var a = 10
    var b = 20

    val temp = a   // store a in temp
    a = b
    b = temp

    println("After swapping: a = $a, b = $b")
}
