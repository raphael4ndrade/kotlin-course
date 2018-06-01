package classes

class Movie3(name: String, year: Int, gender: String){
    val name: String
    val year: Int
    val gender: String

    init {
        this.name = name
        this.year = year
        this.gender = gender
    }
}

fun main(args: Array<String>) {
    val movie = Movie3("The incredibles", 2004, "Action")
    println("The ${movie.name} was released in ${movie.year}. An ${movie.gender} movie.")
}