import java.util.Scanner

fun isVowel(letter: Char): Boolean {
    val vowels = setOf('A', 'E', 'I', 'O', 'U')
    return vowels.contains(letter.toUpperCase())
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}