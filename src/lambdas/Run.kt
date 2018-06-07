package lambdas

data class House(var address: String = "", var num: Int = 0)

fun main(args: Array<String>) {
    var house = House()

    house.run {
        address = "Street B"
        num = 1509
    }

    println(house)
}