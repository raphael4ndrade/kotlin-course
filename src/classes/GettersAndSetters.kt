package classes

class Client2{
    constructor(name: String){
        this.name = name
    }

    var name: String
        get() = "My name is $field"
        set(value){
            field = value.takeIf { value.isNotEmpty()} ?:  "Anonymous"
        }
}

fun main(args: Array<String>) {
    val c1 = Client2("")
    println(c1.name)
    c1.name = "Raphael"
    println(c1.name)
}