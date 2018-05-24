package fundamentals.loops

fun main(args: Array<String>) {
    var option = 0
    var counter = 0

    while(counter <= 10){
        println(counter)
        counter++
    }

    while(option != -1){
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0

        println("You choose the option $option")
    }

    println("See you later!")


}