package classes

class Movie2(val name: String, val year: Int, val gender: String)


fun main(args: Array<String>) {
    val m2 = Movie2("Monster's University", 2001, "comedy")

    println("${m2.name} was released in ${m2.year}. Amazing ${m2.gender} movie!")
}