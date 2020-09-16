import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextDouble()
    val result = Math.cbrt(input).toLong()
    print(result)
}