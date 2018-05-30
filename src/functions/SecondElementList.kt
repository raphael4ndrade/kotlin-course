package functions

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    val list = listOf(1, "Raphael", 2.2, 'C')
    val list2 = listOf('A')
    println(list.secondOrNull())
    println(list2.secondOrNull())
}