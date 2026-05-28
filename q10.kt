// WAP to check whether a character is a vowel or consonant using a function

fun checkVowelOrConsonant(ch: Char) {
    val vowels = "aeiouAEIOU"

    if (ch in vowels) {
        println("$ch is a Vowel")
    } else {
        println("$ch is a Consonant")
    }
}

fun main() {
    checkVowelOrConsonant('A')
    checkVowelOrConsonant('z')
}
