fun main() {
    val numbers = listOf(3,5,21,2,3,1,9,6)
    
    val oddNumbers: MutableList<Int> = mutableListOf()
    val evenNumbers: MutableList<Int> = mutableListOf()
    
    for (num in numbers){
        if (num%2==0){
            evenNumbers.add(num)
        }else{
            oddNumbers.add(num)
        }
    }
    
    println("Even numbers ${evenNumbers.toString()}")
    println("Odd numbers ${oddNumbers.toString()}")
    
}
