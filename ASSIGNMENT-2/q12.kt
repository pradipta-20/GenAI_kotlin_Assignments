// A higher-order function takes another function as a parameter
fun executeTwice(action: () -> Unit) {
    action() // First execution
    action() // Second execution
}

fun main() {
    executeTwice {
        println("Hello!")
    }
}