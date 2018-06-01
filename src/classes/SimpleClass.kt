package classes

class Client {
    var name: String = ""

}

fun main(args: Array<String>) {
    val client = Client()
    client.name = "João"
    println("My client is ${client.name}.")
}