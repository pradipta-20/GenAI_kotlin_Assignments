// Classes in Kotlin are closed by default, so we use 'open' to allow inheritance
open class Vehicle {
    // Functions must also be 'open' to be overridden
    open fun startEngine() {
        println("Engine started.")
    }
}

// Motorcycle inherits from Vehicle using the colon (:) operator
class Motorcycle : Vehicle() {
    // Use the 'override' keyword to change the behavior of the parent method
    override fun startEngine() {
        println("Vroom!")
    }
}

fun main() {
    val myBike = Motorcycle()
    myBike.startEngine() // Prints: Vroom!
}