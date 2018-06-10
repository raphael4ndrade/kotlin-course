package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10020030040, "Joao")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")

    map.put(60070080090, "Pedro Jr.")

    for (p in map)
        println("${p.key} : ${p.value}")

    for (p in map.values)
        println(p)

    for (p in map.keys)
        println(p)

    for (p in map.entries)
        println(p)

    for ((cpf, name) in map)
        println("$name (CPF: $cpf)")

    map.size.print()
    map.get(30040050060)?.print()
    map[30040050060]?.print()
    map.containsKey(30040050060).print()
    map.remove(30040050060)?.print()
    map.clear()
    map.isEmpty().print()

}