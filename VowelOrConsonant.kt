fun main(){

    print("Give me a one string character: ")
    val text = readlnOrNull().toString().toLowerCase()

    val result = when (text){
        "a","e","i","o","u" -> "Vowel"
        else -> {"Consonant"}
    }

    print("The characer is $result")
}
