import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()
    val four = scanner.nextInt()
    val five = scanner.nextInt()
    val firstRange = one..two
    val secondRange = three..four
    print(five in firstRange || five in secondRange)
}