package fundamentals.operators

fun main(args: Array<String>) {
    val execWorkOne = false
    val execWorkTwo = false

    val buyIceCream = execWorkOne || execWorkTwo
    val buyTv50 = execWorkOne && execWorkTwo
    val buyTv32 = execWorkOne xor execWorkTwo

    println(buyIceCream)
    println(buyTv50)
    println(buyTv32)

    if(!buyIceCream){
        println("Less sugar, thanks!")
    }
}