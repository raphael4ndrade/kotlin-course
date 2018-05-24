package fundamentals

fun main(args: Array<String>) {
    val optional: String? = null
    val mandatory: String = optional ?: "default value"

    print(mandatory)
}