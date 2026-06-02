// Expanded from Question 10
sealed class ScreenState

object Loading : ScreenState()
data class Success(val data: String) : ScreenState()
data class Error(val errorMsg: String) : ScreenState() // Added state

// Function that handles every possible variant of ScreenState
fun renderUI(state: ScreenState) {
    when (state) {
        is Loading -> println("Loading data... Please wait.")
        is Success -> println("Success! Content: ${state.data}")
        is Error -> println("An error occurred: ${state.errorMsg}")
    }
}

fun main() {
    val errorState = Error("Connection Timed Out")
    renderUI(errorState)
}