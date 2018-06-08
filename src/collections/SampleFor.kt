package collections

fun main(args: Array<String>) {
    var students = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

    for (student in students)
        println(student)

    for (i in students.indices)
        println("$i - ${students.get(i)}")

    for ((index, student) in students.withIndex())
        println("$index - $student")
}