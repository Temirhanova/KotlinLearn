import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val participles = scanner.nextInt()
    val nuts = scanner.nextInt()
    print(nuts % participles)
}