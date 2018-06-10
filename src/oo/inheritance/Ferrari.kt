package oo.inheritance

class Ferrari: Car(maxVelocity =  400), Sport {
    override var turbo: Boolean = false
        get() = field
        set(value) {field = value}

    override fun accelerating() {
        alterVelocityWith(if (turbo) 50 else 25)
    }

    override fun breaking() {
        alterVelocityWith(-25)
    }
}