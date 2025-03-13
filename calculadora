import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Bienvenido a la calculadora")
    println("Selecciona una operación:")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")

    print("Ingresa el número de la operación (1/2/3/4): ")
    val operacion = scanner.nextInt()

    print("Ingresa el primer número: ")
    val num1 = scanner.nextDouble()

    print("Ingresa el segundo número: ")
    val num2 = scanner.nextDouble()

    when (operacion) {
        1 -> println("El resultado de la suma es: ${num1 + num2}")
        2 -> println("El resultado de la resta es: ${num1 - num2}")
        3 -> println("El resultado de la multiplicación es: ${num1 * num2}")
        4 -> {
            if (num2 != 0.0) {
                println("El resultado de la división es: ${num1 / num2}")
            } else {
                println("Error: No se puede dividir por 0.")
            }
        }
        else -> println("Operación no válida.")
    }
}
