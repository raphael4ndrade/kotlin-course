package functions

fun relationWork(boss: String, worker: String): String {
    return "$worker needs to work more for $boss."
}

fun main(args: Array<String>) {
    println(relationWork("Raphael","Leonardo"))
    println(relationWork(worker = "Leonardo", boss = "Raphael"))
}