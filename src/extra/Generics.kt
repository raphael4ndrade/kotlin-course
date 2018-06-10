package extra

class Box<T>(val obj: T){
    private val objs = ArrayList<T>()

    init {
        add(obj)
    }

    fun add(newObj: T){
        objs.add(newObj)
    }

    override fun toString(): String {
        return objs.toString()
    }
}

fun main(args: Array<String>) {
    val material = Box("Pen")
    material.add("Eraser")
    material.add("Notebook")
    println(material)

    val num = Box(obj = 1)
    num.add(3)
    num.add(10)
    println(num)
}