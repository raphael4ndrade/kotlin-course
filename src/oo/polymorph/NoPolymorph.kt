package oo.polymorph

class Bean2(val weight: Double)

class Rice2(val weight: Double)

class Person2(var weight: Double){
    fun toEat(bean: Bean2){
        weight += bean.weight
    }

    fun toEat(rice: Rice2) {
        weight += rice.weight
    }
}

fun main(args: Array<String>) {
    val bean = Bean2(0.3)
    val rice = Rice2(0.3)

    val jaum = Person2(80.5)
    jaum.toEat(bean)
    jaum.toEat(rice)

    println(jaum.weight)
}