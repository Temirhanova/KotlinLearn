import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char1 = scanner.next().first()
    val char2 = scanner.next().first()
    print(char1.toLowerCase() == char2.toLowerCase())
}