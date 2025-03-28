fun main() {

    // Crear un mapa con la lista de productos de un mercado. Mostrar los elementos ordenados alfabéticamente.
    
    val productos = mapOf(
        "Naranja" to 1,
        "Manzana" to 2,
        "Papaya" to 4
    )
    
    // Ordenar el mapa por las claves (nombre de los productos)
    val sortedProducts = productos.toSortedMap()
    
    // Imprimir los productos ordenados alfabéticamente
    for ((producto, precio) in sortedProducts) {
        println("$producto: con un precio de $precio")
    }
}
