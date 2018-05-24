package fundamentals.control

fun getRandom(max: Double = 10.0):Double {
    return Math.random() * max
}

fun main(args: Array<String>) {
    val grade: Double = getRandom(8.0)
    println("Grade = $grade")

    if(grade > 6.9){
        println("Approved")
    } else {
        println("Failed")
    }

    /**
     * Special case, just for kotlin
     */
    var numberA = 1
    var numberB = 3
    val major = if(numberA > numberB){
        println("processing if statement...")
        numberA
    } else {
        println("processing else statement")
        numberB
    }

    println("The major value is $major.")

}