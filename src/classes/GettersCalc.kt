package classes

class Product(var name: String, var price: Double, var discount: Double, var active: Boolean){
    val inactive: Boolean get() = !active
    val priceOff: Double get() = price * (1 - discount)
}

fun main(args: Array<String>) {
    val p1 = Product("Ipad", 2349.90, 0.20, true)
    println(p1.priceOff)

    val p2 = Product("Galaxy Note", 2699.49, 0.50, false)
    println("${p2.name}\n ${p2.price}\n ${p2.priceOff}")

    if(p2.inactive){
        p2.price = 0.0
        println("${p2.priceOff}")
    }
}