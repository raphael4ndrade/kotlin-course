package functions

inline fun <T> runWithLog(functionName: String, function: () -> T): T {
    try {
        println("Into method $functionName")
        return function()
    } finally {
        println("Method $functionName ending...")
    }
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

/**
 * Pay attention... It's tricky.
 */
fun main(args: Array<String>) {
    val result = runWithLog("sum"){
        sum2(4,5)
    }

    println(result)
}