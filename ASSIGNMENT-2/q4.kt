open class Employee(val baseSalary: Int) {
    fun showSalary() {
        println("Base Salary: $baseSalary")
    }
}

// Manager inherits from Employee and passes the specific hardcoded value (80000) directly to it
class Manager : Employee(80000) {
    fun displayRole() {
        println("Role: Manager")
    }
}

fun main() {
    val manager = Manager()
    manager.displayRole()
    manager.showSalary() // Prints: Base Salary: 80000
}