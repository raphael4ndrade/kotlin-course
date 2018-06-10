package collections

class Object(val name: String, val desc: String) {
    override fun hashCode(): Int {
        return name.length
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Object) {
            name.equals(other.name, ignoreCase = true)
        } else
            return false
    }
}

fun main(args: Array<String>) {
    val set = hashSetOf(
            Object("Chair", "..."), //hascode = 5
            Object("Table",  "..."), //hashcode = 5
            Object("Knife", "..."), //hashcode = 5
            Object("Glass", "..."), //hashcode = 5
            Object("Refrigerator", "...") //hashcode = 12
    )

    set.contains(Object("knife", "???")).print()
}