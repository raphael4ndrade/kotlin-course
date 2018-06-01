package classes

class Refrigerator(val brand: String, val capacity: Int)


/**
 * Data Class implements some functions as default such as: equals, toString...
 * also destructuring.
 */
data class Tv(val brand: String, val size: Int)

fun main(args: Array<String>) {
    val r1 = Refrigerator("Brastemp", 320)
    val r2 = Refrigerator("Brastemp", 320)

    println(r1 == r2)
    println(r1.toString())

    val t1 = Tv("Samsung", 32)
    val t2 = Tv("Samsung", 32)

    println(t1 == t2)
    println(t1 === t2)
    println(t1.toString())
    println(t1.copy(size = 42))

    val (brand, size) = t1
    println("$brand $size")

}