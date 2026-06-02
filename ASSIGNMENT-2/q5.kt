// Abstract classes cannot be instantiated directly and can contain abstract methods
abstract class Animal {
    // Abstract methods have no body/implementation here
    abstract fun makeSound()
}

// Cat must implement the abstract method of its parent class
class Cat : Animal() {
    override fun makeSound() {
        println("Meow!")
    }
}

fun main() {
    val myCat = Cat()
    myCat.makeSound() // Prints: Meow!
}