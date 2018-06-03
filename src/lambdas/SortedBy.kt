package lambdas

fun main(args: Array<String>) {
    val names = arrayListOf("Raphael", "Renata", "William", "Bruno")
    val ordered = names.sortedBy { it }

    println(ordered)
}