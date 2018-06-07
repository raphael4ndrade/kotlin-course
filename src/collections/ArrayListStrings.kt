package collections

fun main(args: Array<String>) {
    val strings = arrayListOf("A", "B", "C", "D")

    for (item in strings)
        println(item.toLowerCase())
}