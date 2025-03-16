fun main(){
    print("Digite el primer número: ")
    var numero1 = readLine()?.toInt() ?: 0
    print("Digite el segundo número: ")
    var numero2 = readLine()?.toInt() ?: 0

    val total = numero1 + numero2
    print("La sumatoria total es $total")
}
