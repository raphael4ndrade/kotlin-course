package collections

fun main(args: Array<String>) {
    val listMix = arrayListOf("Raphael", true, 1, 3.14, 'p')

    for (item in listMix){
        if(item is String)
            println(item.toUpperCase())
        else
            println(item)
    }
}