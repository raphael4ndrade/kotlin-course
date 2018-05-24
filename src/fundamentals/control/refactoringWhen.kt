package fundamentals.control

fun main(args: Array<String>) {
    val grade = 5

    when(grade){
        10, 9 -> println("Amazing!")
        8, 7 ->println("Congrats")
        in 4..6 ->println("Do better")
        in 0..3 ->println("See you next term. ;)")
        else -> println("Invalid value.")
    }

}