data class Product(val name: String, var price: Double)

fun main() {
    val inventory = listOf(
        Product("Laptop", 1000.0),
        Product("Mouse", 25.0),
        Product("Keyboard", 60.0)
    )

    // Chaining operations
    val discountedExpensiveProducts = inventory
        .map { it.copy(price = it.price * 0.9) } // Applies 10% discount safely via copy
        .filter { it.price > 50.0 }              // Keeps only products costing over $50

    println(discountedExpensiveProducts) 
}