package classes

class Calculator{
    private var results: Int = 0

    fun sum(vararg numbers: Int): Calculator {
        numbers.forEach { results += it }
        return this
    }

    fun times(number : Int): Calculator {
        results *= number
        return this
    }

    fun clean(): Calculator {
        results = 0
        return this
    }

    fun print(): Calculator{
        println(results)
        return this
    }

    fun getResults(): Int = results
}

fun main(args: Array<String>) {
    val calculator = Calculator()

    calculator.sum(1,2,3).times(3).print()
    calculator.sum(7,10).print().clean()

    println(calculator.getResults())
}