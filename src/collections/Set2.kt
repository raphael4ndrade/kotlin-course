package collections

fun main(args: Array<String>) {
    val approveds = hashSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")
    approveds.add("Raphael")

    println("No order....")
    for (ap in approveds)
        ap.print()

    val approvedsInOrder1 = linkedSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")

    println("Linked..")
    for (ap in approvedsInOrder1)
            ap.print()

    val approvedsInOrder2 = sortedSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")

    println("Sorted...")
    for ( ap in approvedsInOrder2)
            ap.print()


    /**
     * Crazy order...
     */
    approveds.sortedBy { -it.length }.print()
}