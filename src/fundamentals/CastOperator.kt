package fundamentals

fun printConcept(grade: Any){
    when(grade as? Int){
        10,9 -> println("A")
        8,7  -> println("B")
        6,5  -> println("C")
        4,3 -> println("D")
        2,1,0  -> println("E")
        else -> println("Invalid")
    }
}

fun main(args: Array<String>) {
    val grades = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (g in grades){
        printConcept(g.toInt())
    }
}