import kotlinx.coroutines.delay

// The 'suspend' keyword allows the function to pause execution without blocking the underlying thread
suspend fun fetchWeather(): String {
    delay(1000ms) // Non-blocking delay for 1 second
    return "Sunny"
}