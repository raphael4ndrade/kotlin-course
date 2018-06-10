package oo.inheritance

open class Animal(val name: String)

class Dog: Animal{
    private val height: Double

    constructor(name: String, height: Double): super(name){
        this.height = height
    }

    constructor(name:String): this(name, 0.0)

    override fun toString(): String {
        return "$name has $height meters"
    }
}

fun main(args: Array<String>) {
    val dogAlemao = Dog("Spike", 84.0)
    val yorkshire = Dog("Lady Di")

    println(dogAlemao.toString())
    println(yorkshire.toString())
}