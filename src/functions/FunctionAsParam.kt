package functions

class Operations{
    fun sum(a: Int, b: Int) = a + b
}

/**
 * Top Level Functions!
 */
fun sum(a: Int, b: Int) = a + b

fun calc(a: Int, b: Int, function: (Int, Int) -> Int): Int{
    return function(a,b)
}

fun <E>filter(list: List<E>, filter: (E) -> Boolean): List<E>{
    val filteredList = ArrayList<E>()
    for(e in list){
        if (filter(e))
            filteredList.add(e)
    }
    return filteredList
}

fun withThreeLetters(name: String): Boolean = name.length == 3

fun main(args: Array<String>) {
    println(calc(10,20, Operations()::sum))
    println(calc(10,30, ::sum))

    val list = listOf("Raphael", "Ana", "Rebeca", "Bia", "Gui")
    println(filter(list, ::withThreeLetters))
}