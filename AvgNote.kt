fun main() {
    print("Give me the first number: ")
    val nota1 = readlnOrNull()?.toIntOrNull()

    print("Give me the second number: ")
    val nota2 = readlnOrNull()?.toIntOrNull()

    print("Give me the third number: ")
    val nota3 = readlnOrNull()?.toIntOrNull()

    if (nota1 != null && nota2 != null && nota3 != null) {
        val result = (nota1 + nota2 + nota3) / 3.0 // Use 3.0 for double result
        println("The average note is: $result")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}
