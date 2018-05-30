package fundamentals

fun imSmart(x: Any){
    if(x is String)
        println(x.toUpperCase())
    else if(x is Int)
        println(x.plus(3))
    else if (x is Char)
        print(x.isLetter())
}

fun imSmartWhen(x: Any){
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(4))
        else -> println("Rethink your atitude!")
    }
}

fun main(args: Array<String>) {
    imSmart("Olá")
    imSmart(10)
    
    imSmartWhen("Hi")
    imSmartWhen(2)
    imSmartWhen(true)
}