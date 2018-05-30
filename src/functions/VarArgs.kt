package functions

fun sort(vararg numbers: Int, another: Int): IntArray {
    println("Another: $another")
    return numbers.sortedArray()
}

fun main(args: Array<String>) {
    for (n in sort(38, 3, 14,2,123,456,23,76, another = 15)){
        print("$n ")
    }
}