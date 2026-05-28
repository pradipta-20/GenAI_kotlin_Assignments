// WAP to check whether a number is a palindrome or not

fun main() {
    val original = 121
    var number = original
    var reversed = 0

    while (number != 0) {
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }

    // if original and reversed are same, it's a palindrome
    if (original == reversed) {
        println("$original is a Palindrome")
    } else {
        println("$original is not a Palindrome")
    }
}
