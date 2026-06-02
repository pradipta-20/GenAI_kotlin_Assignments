// In Kotlin, using 'object' instead of 'class' automatically creates a Singleton
object Database {
    fun connect() {
        println("Connected to DB")
    }
}

fun main() {
    // No need to instantiate with "Database()", we call it directly by its name
    Database.connect()
}