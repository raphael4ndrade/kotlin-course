package oo.inheritance

interface Sport {
    var turbo: Boolean

    fun turnOnTurbo(){
        turbo = true
    }

    fun turnOffTurbo(){
        turbo = false
    }
}