package classes

/**
 * Error: Kotlin: val cannot be reassigned
 */
//fun byReference(velocity: Int){
//    velocity++
//}

data class Car(var brand: String, var model: String, var velocity: Int = 0)

fun byReference(car: Car){
    car.velocity++
}

fun main(args: Array<String>) {
    var car1 = Car("Ford", "Fusion")

    var car2 = car1
    car2.model = "Edge"
    println(car1)

    var car3 = car1.copy()
    var isSame = car1 === car3
    println("car1 === car3 ? $isSame")
    car3.model = "Ka"
    println(car3)

    car1 = Car("Audi", "A4")
    byReference(car1)
    byReference(car2)

    println(car1)
    println(car2)


}