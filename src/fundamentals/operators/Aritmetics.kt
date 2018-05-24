package fundamentals.operators

fun main(args: Array<String>) {
    val (v1, v2, v3, v4) = listOf(3, 5, 1, 15)

    val sum = v1 + v2 + v3 + v4
    val sub = v4 - v2
    val div = v4 / v1
    val tim = v1 * v2
    val mod = v1 % 2

    print("$sum $sub $div $tim $mod")

}