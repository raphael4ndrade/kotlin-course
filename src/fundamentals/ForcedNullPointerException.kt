package fundamentals

fun main(args: Array<String>) {
    var number: Int? = null
    println(number?.inc())

    /**
     * !! operator, forces!
     */
    println("Getting the error...")
    print(number!!.inc())
}