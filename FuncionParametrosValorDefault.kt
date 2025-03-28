fun main() {
    printDetallePersona("Juan", 25)
    println() // Salto de línea
}

fun printDetallePersona(nombre: String, edad: Int, estrato: Char = 'C') {
    // Imprime los detalles de la persona
    println("Persona con los datos: Nombre: $nombre, Edad: $edad, Estrato: $estrato")
}
