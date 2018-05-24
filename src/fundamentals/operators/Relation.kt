package fundamentals.operators

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 >= 2)
    println(3 <= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    //  Referential equality
    println("Result with '===' ${d1 === d2}")

    //  Strutural equality
    println("Result with '==' ${d1 == d2}")
    //println("Result with '==' ${d1.equals(d2)}")
}