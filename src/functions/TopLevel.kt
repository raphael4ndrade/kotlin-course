package functions


/**
 * Functions dont need classes to live in Kotlin! That's awesome. ;)
 */
fun min(a: Int, b: Int):Int = if(a < b) a else b

fun main(args: Array<String>) {
    print("The minor value is ${min(3,4)}")
}