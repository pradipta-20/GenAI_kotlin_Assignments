// Sealed classes restrict the class hierarchy, making it perfect for representing state
sealed class ScreenState

// Object is used because 'Loading' doesn't hold any unique dynamic state/data
object Loading : ScreenState()

// Data class is used because 'Success' needs to carry a dynamic payload/value
data class Success(val data: String) : ScreenState()

fun main() {
    // Common student scenario: handling these states inside a 'when' expression
    val currentState: ScreenState = Success("Dashboard loaded successfully!")

    when (currentState) {
        is Loading -> println("Showing a progress spinner...")
        is Success -> println("Displaying content: ${currentState.data}")
    }
}