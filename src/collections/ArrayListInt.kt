package collections

fun main(args: Array<String>) {
    val odd = arrayListOf(2, 4, 6)
    val even = intArrayOf(1, 3, 5)

    for (n in even.union(odd).sorted()){
        print("$n")
    }
}