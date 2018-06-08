package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val set = hashSetOf("Raphael", 3, 'a', true, 3.14)

    set.add(3).print()
    set.add(5).print()

    set.size.print()

    set.remove("a").print()
    set.remove('a').print()

    set.contains('a').print()
    set.contains("Raphael").print()

    val nums = setOf(1, 2, 3)
    (set + nums).print()
    (set - nums).print()

    set.intersect(nums).print()
    set.retainAll(nums) //it does change the set
    set.print()

    set.clear()
    set.isEmpty().print()
}