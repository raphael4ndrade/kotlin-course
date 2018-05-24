package fundamentals

fun main(args: Array<String>) {
    val pass = listOf("Joao", "Maria", "Pedro")
    /**
     * Interpolation as ES6
     */
    println("The first place is ${pass[0]}")

    val goodMood = false
    print("Today I'm ${if(goodMood) "happy" else "unhappy"}.")

}