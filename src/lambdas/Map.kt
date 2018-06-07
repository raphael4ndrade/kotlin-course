package lambdas

fun main(args: Array<String>) {
    val students = arrayOf("Pedro", "Jonas", "Thiago")
    students.map { it.toUpperCase() }.apply{ print(this)}
}