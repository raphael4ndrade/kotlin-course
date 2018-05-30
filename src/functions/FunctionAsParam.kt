package functions

class Operations{
    fun sum(a: Int, b: Int) = a + b
}

/**
 * Top Level Functions!
 */
fun sum(a: Int, b: Int) = a + b

fun calc(a: Int, b: Int, function: (Int, Int) -> Int): Int{
    return function(a,b)
}

fun <T>filter()

fun main(args: Array<String>) {
    println(calc(10,20, Operations()::sum))
    println(calc(10,30, ::sum))
}