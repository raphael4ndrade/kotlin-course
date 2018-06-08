package collections

fun main(args: Array<String>) {
    val listOne = arrayListOf(1, 2, 3, 4, 5)
    val listTwo = arrayListOf("Raphael", "Pedro", "Leandro", "Gustavo")

    val union = listOne + listTwo

    for (item in union)
        println(item)
}