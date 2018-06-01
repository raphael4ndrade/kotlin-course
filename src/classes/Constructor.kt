package classes

enum class Category { HORROR, DRAMA}

class Movie {
    val name: String
    val category: Category
    val year: Int

    constructor(name: String, year: Int, category: Category){
        this.name = name
        this.year = year
        this.category = category
    }
}

fun main(args: Array<String>) {
    val movie = Movie("The Grandfather", 1972, Category.DRAMA)
    println("${movie.name} was released in ${movie.year}. A pretty good ${movie.category}!")
}