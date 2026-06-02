import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    
    // async starts a coroutine that performs a computation and promises a future result
    val deferredResult = async {
        5 + 5
    }

    // .await() pauses until the async calculation completes and then extracts the value
    val finalAnswer = deferredResult.await()
    
    println("The result is: $finalAnswer") 
}