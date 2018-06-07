package lambdas

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C")

    for (item in listWithNulls){
        item?.let {
            println(it.toLowerCase())
        }
    }
    /**
     * apply returns the type of the object manipulated, let always return an Unit
     */
}