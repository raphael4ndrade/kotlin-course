package classes


enum class DayWeek2(val id: Int, val name2: String, val util: Boolean) {
    SUNDAY(1,"Sunday", false),
    MONDAY(2, "Monday", true),
    TUESDAY(3, "Tuesday", true),
    WEDNESDAY(4, "Wednesday", true),
    THURSDAY(5, "Thursday", true),
    FRIDAY(6, "Friday", true),
    SATURDAY(7, "Saturday", false)
}

fun main(args: Array<String>) {
    for (day in DayWeek2.values())
        println("${day.name2} is ${if(day.util) "an util" else "a weekend"} day")
}