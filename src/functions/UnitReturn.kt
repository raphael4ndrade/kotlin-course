package functions

fun printMajor(a: Int, b: Int){
    println(Math.max(a,b))
}

fun printMajor2(a: Int, b: Int): Unit{
    println(Math.max(a,b))
}

fun printMajor3(a: Int, b: Int): Unit{
    println(Math.max(a,b))
    return
}

fun printMajor4(a: Int, b: Int): Unit{
    println(Math.max(a,b))
    return Unit
}

fun printMajor5(a: Int, b: Int){
    println(Math.max(a,b))
    return Unit
}

fun main(args: Array<String>) {
    printMajor(2,1)
    printMajor2(2,1)
    printMajor3(2,1)
    printMajor4(2,1)
    printMajor5(2,1).run { 2 < 1 }.run { println("Result = $this") }

}