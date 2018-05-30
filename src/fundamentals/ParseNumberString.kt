package fundamentals

fun main(args: Array<String>) {
    val number = 1
    val stringifyNumber: String = number.toString()

    println(stringifyNumber)
    println(stringifyNumber + 11) // printing... 111
    println("1.9".toDouble() + 3)
    println("teste".toIntOrNull())
    println("teste".toIntOrNull() ?: 0) // hey Elvis! ;)
    println("3".toInt() + 1)
}