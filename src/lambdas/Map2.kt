package lambdas

data class Product(val name: String, val price: Double)

val schoolMaterials = listOf(
        Product("Notebook", 2.30),
        Product("Pen", 1.90),
        Product("Eraser", 0.50),
        Product("Scisors", 3.80)
)

fun main(args: Array<String>) {
    val total = { total: Double, current: Double -> total + current }
    val priceTotal = schoolMaterials.map { it.price }.reduce(total)

    println("The mean price is ${priceTotal / schoolMaterials.size}.")
}