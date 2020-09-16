import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var product = 1L
    for (i in scanner.nextInt() until scanner.nextInt()) {
        product *= i
    }
        print(product)
}