import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun fetchUserData(): String {
    delay(1000) // Simulates network lag
    return "Alice"
}

suspend fun fetchAppConfig(): String {
    delay(2000) // Simulates network lag
    return "Dark Mode"
}

fun main() = runBlocking {
    // Measuring execution time to verify it runs concurrently (~2 seconds total)
    val timeTaken = measureTimeMillis {
        
        // Starting both suspend functions simultaneously using async
        val deferredUser = async { fetchUserData() }
        val deferredConfig = async { fetchAppConfig() }

        // Both are running in parallel right now. We await their results here.
        val user = deferredUser.await()
        val config = deferredConfig.await()

        println("Retrieved User: $user, Theme: $config")
    }
    
    println("Total execution time: ${timeTaken}ms") 
    // Should print slightly over 2000ms instead of 3000ms
}