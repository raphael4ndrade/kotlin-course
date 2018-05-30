package functions

fun increments(num: Int): Int{
//    num++ Error!!!
    val aux: Int = num
    return aux + 10
}

fun main(args: Array<String>) {
    println(increments(3))
}