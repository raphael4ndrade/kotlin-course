package functions


inline fun transaction(function: () -> Unit){
    try {
        println("Opening transaction...")
        function()
    } finally {
        println("Closing trasanction...")
    }
}

fun main(args: Array<String>) {
    /**
     * No parameters, no need to open/close parentesis.
     */
    transaction {
        println("Running SQL 1...")
        println("Running SQL 2...")
        println("Running SQL 3...")
    }
}