package functions

fun pot(base: Int = 2, exp: Int = 1): Int {
    return (Math.pow(base.toDouble(), exp.toDouble())).toInt()
}

fun main(args: Array<String>) {
    println(pot(2,3))
    println(pot(10))
    println(pot(base = 10))
    println(pot(exp = 8))
}