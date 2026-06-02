class BankAccount(initialBalance: Double) {
    // Private variable so it cannot be accessed directly from outside the class
    private var balance: Double = initialBalance

    // Public function to safely update the balance
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Successfully deposited: $$amount. New balance: $$balance")
        } else {
            println("Invalid deposit amount!")
        }
    }

    // Public getter to check the balance since it's private
    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val myAccount = BankAccount(100.0)
    myAccount.deposit(50.0)
}