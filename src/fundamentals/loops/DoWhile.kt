package fundamentals.loops

fun main(args: Array<String>) {
    var option = 0

    do {
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0
        println("You choose the option $option")
    } while (option != -1)

    println("See you later. Dude!")
}