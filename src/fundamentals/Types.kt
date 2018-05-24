package fundamentals

fun main(args: Array<String>) {
    /**
     * Trying to reach the max possible number in each case
     */
    val byte: Byte = 127
    val short: Short = 32767
    val int: Int = 2_147_483_647
    val long: Long = Long.MAX_VALUE //Nice tip! ;)

    val float: Float = 3.14F
    val double: Double = 3.14

    val char: Char = '?'

    val boolean: Boolean = true // or false

    println(listOf(byte, short, int,long,float, double, char, boolean))

    println(2 is Int)
    println(10.dec() is Int)
//    Remember, everything in Kotlin is an Object. ;)

}