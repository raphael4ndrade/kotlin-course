package classes

var discount: Double = 0.0

class  Item(val name: String, val price: Double){
    companion object {
        fun create(name: String,price: Double ) = Item(name, price)
//        @JvmStatic var discount: Double = 0.0
    }

    fun priceOff(): Double = price - (price * discount)
}

fun main(args: Array<String>) {
    val item1 = Item.create("Tv 50 inchs", 2898.90)
    val item2 = Item("Oven", 200.00)

//    Item.discount = 0.5
    discount = 0.10
    println(item1.priceOff())
    println(item2.priceOff())
}