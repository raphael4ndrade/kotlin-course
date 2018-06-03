package lambdas

data class Student(val name: String, val grade: Double)

fun main(args: Array<String>) {
    val students = arrayListOf(
            Student("Pedro", 7.4),
            Student("Arthur", 8.0),
            Student("Raphael", 9.4),
            Student("Ricardo", 5.2)
    )

    /**
     * This is fucking amazing!!!
     */
    students.filter { it.grade >= 7.0 }.sortedBy { it.name }.also(::println)
}