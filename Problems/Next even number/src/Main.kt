import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputValue1 = scanner.nextLine().toInt()
    println(inputValue1 + (2 - inputValue1 % 2))
}