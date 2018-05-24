package fundamentals

fun printSum(a: Int, b: Int){
    println(a + b)
}

/**
 * @params a for an integer to sum, b for an integer also default to 1.
 */
fun sum(a: Int, b: Int = 1): Int {
    return a + b
}

fun minus(a: Float = 1.0F, b:Float = 1.0F): Float{
    return (a - b)
}

fun main(args: Array<String>) {
    printSum(-10, 20)


    println(sum(10))
    println(sum(11,5))
}