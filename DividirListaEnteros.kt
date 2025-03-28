fun dividirParesImpares(lista: List<Int>): Pair<List<Int>, List<Int>> {
    val pares = lista.filter { it % 2 == 0 }
    val impares = lista.filter { it % 2 != 0 }
    return Pair(pares, impares)
}

fun main() {
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val (pares, impares) = dividirParesImpares(lista)

    println("Pares: $pares")
    println("Impares: $impares")
}
