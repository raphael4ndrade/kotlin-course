package extra

fun fatorial(num: Int): Int = when (num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1)
    else -> throw  IllegalArgumentException("Negative number")
}

fun main(args: Array<String>) {
    println("Result: ${fatorial(9)}")

}