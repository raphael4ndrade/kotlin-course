package classes

class PersonOne(var name: String)

class PersonTwo(val name:String)

class PersonThree(initialName: String){
    val name: String = initialName
}

fun main(args: Array<String>) {
    val p1 = PersonOne("Joao")
    p1.name = "Guilherme"

    val p2 = PersonTwo("Maria")

    val p3 = PersonThree("Pedro")

    println("${p2.name} e ${p3.name} are cool!!")
}