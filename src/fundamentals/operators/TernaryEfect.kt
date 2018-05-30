package fundamentals.operators

fun getResult(grade: Double): String = if(grade >=7.0) "Yaas!" else "Noooh!"

fun main(args: Array<String>) {
    val grade = 6.0
    val result: String = if(grade >=7.0) "Approved" else "Failed"

    println(result)
    println(getResult(grade))
}