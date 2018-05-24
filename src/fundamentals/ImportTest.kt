package fundamentals

import fundamentals.packageA.simpleFun as funSimple
import fundamentals.packageA.Thing
import fundamentals.packageA.FaceCoin.CARA
import fundamentals.packageB.*

fun main(args: Array<String>) {
    kotlin.io.println("Everything in kotlin.io is ready to use! ;)")
    println(funSimple("Ok! Nice"))

    val thing = Thing("Ball")
    println(thing.name)

    println(CARA)

    println("${sum(2, 3)}, ${sub(4, 7)}")
}