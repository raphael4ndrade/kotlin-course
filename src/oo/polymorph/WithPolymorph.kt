package oo.polymorph

open class Food(val weight: Double)

class Bean(weight: Double): Food(weight)
class Rice(weight: Double): Food(weight)
class Egg(weight: Double): Food(weight)

class Person(var weight: Double){
    fun toEat(food: Food){
        weight += food.weight
    }
}

fun main(args: Array<String>) {
    val bean = Bean(.3)
    val rice = Rice(.3)
    val egg = Egg(.5)

    val jaum = Person(80.5)
    jaum.toEat(bean)
    jaum.toEat(rice)
    jaum.toEat(egg)

    println(jaum.weight)
}