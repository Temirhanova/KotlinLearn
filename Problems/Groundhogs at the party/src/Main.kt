import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOfCups = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()
    print(isWeekend && numberOfCups >= 15 && numberOfCups <= 25 ||
            !isWeekend && numberOfCups >= 10 && numberOfCups <= 20)
}