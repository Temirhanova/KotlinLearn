import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val symbol1 = scanner.next().first()
    val symbol2 = scanner.next().first()
    val symbol3 = scanner.next().first()
    val symbol4 = scanner.next().first()
    val backslashes = '\\'
    print("" + symbol1.isDigit() + backslashes +
            symbol2.isDigit() + backslashes +
            symbol3.isDigit() + backslashes +
            symbol4.isDigit())
}