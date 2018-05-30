package fundamentals


fun main(args: Array<String>) {
    val valor = "abc"

    if(valor is String)
        println("It is!")
    else if(valor !is String)
        println("Not String")
}