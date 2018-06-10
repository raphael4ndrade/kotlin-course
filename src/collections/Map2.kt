package collections

fun main(args: Array<String>) {
    val map = hashMapOf(1 to "Gui", 2 to "Rebeca", 3 to "Silver")

    for ((id, name) in map)
        println("$id) $name")
}