import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val intValue = scanner.nextInt()
    val result = intValue / 10 % 10
    print(result)
}