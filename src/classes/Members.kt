package classes

class Data(var day: Int, var month: Int, var year: Int){
    fun format(): String = "$day/$month/$year"
}

fun main(args: Array<String>) {
    var birthday: Data = Data(day = 11, month = 12, year= 1989)
    println("${birthday.day}/${birthday.month}/${birthday.year}")

    with(birthday){
        println("$day/$month/$year")
    }

    birthday.month = 3
    print(birthday.format())
}