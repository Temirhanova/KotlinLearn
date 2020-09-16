import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val symbol = scanner.next().first()
    print(symbol.isUpperCase() || symbol in '\u0031'..'\u0039')
}