// Data classes automatically provide useful features like toString(), equals(), and copy()
data class User(
    val id: Int, 
    val username: String, 
    val isActive: Boolean
)

fun main() {
    val user1 = User(1, "pratik_99", true)
    println(user1) // Automatically prints a readable string representation
}