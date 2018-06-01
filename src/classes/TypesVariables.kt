package classes

val onFile = "Good morning"

fun topLevel(){
    val local = "Justin Bieber"
    println("$onFile $local")
}

class Thing{
    var inClass: String = "Good evening!"

    companion object {
        @JvmStatic val constClass = "Hawdy!"
    }

    fun doIt(){
        val local: Int = 7

        if( local > 3){
            val variable = "Nops"
            println("$onFile, $constClass, $local, $variable")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()

    Thing().doIt()
    println(Thing.constClass)
}