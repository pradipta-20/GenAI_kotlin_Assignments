fun main() {
    // Instantiate the initial active user
    val user1 = User(101, "pradipta", true)

    //  The required one-liner using .copy() to alter just one property
    val user2 = user1.copy(isActive = false)

    // Testing the output
    println("Original: $user1")
    println("Copied:   $user2")
}