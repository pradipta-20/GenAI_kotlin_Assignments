import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// runBlocking bridges normal blocking code to a world of coroutines
fun main() = runBlocking {
    
    // launch starts a new background coroutine concurrently (fire-and-forget style)
    launch {
        println("Background task finished")
    }
    
}