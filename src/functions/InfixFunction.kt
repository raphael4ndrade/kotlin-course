package functions

class Product(val name: String, val price: Double)

infix fun Product.moreExpensiveThan(product: Product): Boolean = this.price > product.price

fun main(args: Array<String>) {
    val product1 = Product("Beer", 15.50)
    val product2 = Product("Fries", 5.50)

    println( product1 moreExpensiveThan product2)
    println(product2.moreExpensiveThan(product1))
}