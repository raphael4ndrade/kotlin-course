package fundamentals.loops

fun main(args: Array<String>) {
    for(i in 1..10){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 0..100 step 10){
        println(i)
    }

    for (i in 100 downTo 0 step 10){
        println(i)
    }

    val students = arrayListOf("Andre", "Carla", "Marco")
    for ((index, student) in students.withIndex()){
        println("${index + 1} - $student")
    }
}