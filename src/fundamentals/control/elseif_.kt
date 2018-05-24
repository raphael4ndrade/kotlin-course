package fundamentals.control

fun main(args: Array<String>) {
    val grade: Double = 8.99

    /**
     * Using range operator..
     */
    if(grade in 9..10){
        println("Amazing!")
    } else if( grade in 7.0..8.99){
        println("Congratz.")
    } else if(grade in 4..6){
        println("Do better..")
    } else if(grade in 0..3) {
        println("See you next term. ;)")
    } else {
        println("Invalid grade!")
    }

    println(5 in 7..4)
    println(5 in 4..7)
}
