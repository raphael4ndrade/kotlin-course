package lambdas

fun main(args: Array<String>) {
    println("Your message: ")
    val input = readLine()
    val message = input.takeIf { it?.trim() != ""} ?: "No message!"

    println(message)
}