package functions

import java.util.*

data class Time(val hour: Int, val min: Int, val sec: Int)

fun now(): Time{
    val now = Calendar.getInstance()

    with(now){
        return Time(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main(args: Array<String>) {
//    AWESOMEE!!!
    val (h, m, s) = now()
    println("$h:$m:$s")
}