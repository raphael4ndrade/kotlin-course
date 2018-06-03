package lambdas

fun main(args: Array<String>) {
    val sum = {x: Int, y: Int -> x + y}
    println(sum(4, 6))
    println(sum(5, 6))
    println(sum(6, 6))
}
