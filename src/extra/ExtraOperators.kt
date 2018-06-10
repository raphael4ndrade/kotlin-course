package extra

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
    operator fun unaryMinus(): Point = Point(-x, -y)
    operator fun dec(): Point = Point(x - 10, y - 20)
}

fun main(args: Array<String>) {
    val pointOne = Point(10, 20)
    val pointTwo = Point(10, 20)

    println(-pointOne)
    println(pointOne.dec())
    println(pointOne.dec().dec())
    println(pointOne + pointTwo)
}