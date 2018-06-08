package collections

data class Fruit(val name: String, var price: Double)

fun main(args: Array<String>) {
    var fruits = arrayListOf(Fruit("Banana", 1.50), Fruit("Strawberry", 3.20))
    fruits.add(Fruit("Pinapple", 5.40))
    fruits.add(Fruit("Coconut", 10.00))

    fruits.sortBy { it.name }

    for (fruit in fruits)
        println("${fruit.name} - R$ ${fruit.price}")
}