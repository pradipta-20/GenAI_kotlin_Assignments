// WAP to find the largest among three numbers using a function

fun findLargest(a: Int, b: Int, c: Int): Int {
    var largest = a

    if (b > largest) largest = b
    if (c > largest) largest = c

    return largest
}

fun main() {
    val result = findLargest(10, 45, 23)
    println("Largest number is: $result")
}
