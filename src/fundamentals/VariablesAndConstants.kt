package fundamentals

fun main(args: Array<String>) {
    /**
     * Variables declared with types but no values yet.
     * @params name variable for String or it get null
     */
    var number: Int
    var name: String? = null
    println(name.equals("Hello"))

    /**
     * Variables declared with type inference by value (of course)
     */
    var numberInitialized = 28
    var nameInitialized = "My rules..."
    println(nameInitialized + numberInitialized)

    /**
     * Constants!! Don't try to change it...
     */
    val myMaster = "Raphael is my master!"
    println(myMaster)
}