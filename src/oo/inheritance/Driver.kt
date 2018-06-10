package oo.inheritance

import collections.print

fun main(args: Array<String>) {
    val car = Ferrari()
    car.accelerating()
    println(car)

    car.turnOnTurbo()
    car.accelerating()
    println(car)

    car.breaking()
    car.breaking()
    println(car)
}