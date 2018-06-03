package lambdas

interface Operation{
    fun exec(a: Int, b: Int): Int
}

class Times: Operation{
    override fun exec(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculator {
    fun calc(a: Int, b: Int): Int = a + b

    fun calc(a: Int, b: Int, operation: Operation): Int {
        return operation.exec(a, b)
    }

    /**
     * A way better using lambda function!!!
     */
    fun calc(a: Int, b: Int, operation: (Int, Int) -> Int): Int = operation(a, b)
}

fun main(args: Array<String>) {
    val calculator = Calculator()

    val result1 = calculator.calc(3,4)
    val result2 = calculator.calc(3,4, Times())

    val sub = {a: Int, b: Int -> a - b}
    val result3 = calculator.calc(3, 4, sub)

    println("result1 = $result1\nresult2 = $result2\nresult3 = $result3")
}