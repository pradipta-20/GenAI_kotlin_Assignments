class Window {
    var width = 0
    var height = 0
}

fun main() {
    // .apply configures the object internally ('this' is implicit) and returns the object itself
    val myWindow = Window().apply {
        width = 1920
        height = 1080
    }

    println("Window dimensions: ${myWindow.width}x${myWindow.height}")
}