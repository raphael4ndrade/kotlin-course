package oo.inheritance

open class Car(val maxVelocity: Int = 200, var currentVelocity: Int = 0) {
    protected fun alterVelocityWith(velocity: Int) {
        var newVelocity = velocity + currentVelocity

        currentVelocity = when (newVelocity) {
            in 0..maxVelocity -> newVelocity
            in maxVelocity..1 + Int.MAX_VALUE -> maxVelocity
            else -> 0
        }
    }

    open fun accelerating() {
        alterVelocityWith(5)
    }

    open fun breaking() {
        alterVelocityWith(-5)
    }

    override fun toString(): String {
        return "The current velocity is $currentVelocity km/h"
    }
}