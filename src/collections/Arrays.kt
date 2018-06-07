package collections

fun main(args: Array<String>) {
    val numbers = Array<Int>(10) { i -> i * 10 }

    for (n in numbers)
        println(n)

    println(numbers.get(1))
    println(numbers[1])
    println(numbers.size)
    numbers.set(1, -100)
    println(numbers[1])

}