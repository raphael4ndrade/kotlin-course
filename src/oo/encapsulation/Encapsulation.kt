package oo.encapsulation

import collections.print

private val inFile = 1
//protected val protectedSuport = 1 // It does not work
internal val inProject = 1
val publicAccess = 1

private fun inFile() = 1
//protected fun protectedSuport() = 1 // It does not work
internal fun inProject() = 1
fun publicAccess() = 1


open class Caps{
    private val inClass = 1
    protected val inherited = 1
    internal val inProject = 1
    val public = 1

    private fun inFile() = 1
    protected fun protectedSuport() = 1
    internal fun inProject() = 1
    fun publicAccess() = 1
}

class CapsJr: Caps(){
    fun verifyAccess(){
        println(inProject)
        println(inherited)
        println(public)
    }
}

fun main(args: Array<String>) {
    Caps().inProject().print()
    Caps().publicAccess().print()
//    Caps().inFile()
//    Caps().protectedSuport()

    CapsJr().verifyAccess()
}