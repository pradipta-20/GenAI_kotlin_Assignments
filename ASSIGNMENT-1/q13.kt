// WAP to calculate simple interest using a function

fun simpleInterest(principal: Double, rate: Double, time: Double): Double {
    return (principal * rate * time) / 100
}

fun main() {
    val p = 1000.0
    val r = 5.0
    val t = 2.0

    val si = simpleInterest(p, r, t)
    println("Simple Interest = $si")
}
