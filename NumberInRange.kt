fun main() {
    print("Give me one number: ")

    val num = readlnOrNull()?.toInt()

    val result = when {
        num in 0..50 -> "Range in 0 - 50"
        num in 51..100 -> "Range in 51 - 100"
        else -> "Number out of range"
    }

    println(result)
}
