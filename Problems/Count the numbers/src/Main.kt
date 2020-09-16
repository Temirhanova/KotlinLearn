import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    var sum = 0
    for (i in a..b) {
        sum += if (i % n == 0) 1 else 0
    }
    print(sum)
}