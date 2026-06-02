class Thermostat(initialTemp: Double) {
    // The getter is public by default, but the setter is restricted to this class
    var temperature: Double = initialTemp
        private set

    // A function inside the class that is allowed to change the temperature
    fun adjustTemperature(newTemp: Double) {
        temperature = newTemp
    }
}

fun main() {
    val roomTemp = Thermostat(22.0)
    println("Current Temperature: ${roomTemp.temperature}")
    
    // roomTemp.temperature = 25.0 // This line would cause a compilation error!
    
    roomTemp.adjustTemperature(25.0) // This works fine
    println("Updated Temperature: ${roomTemp.temperature}")
}