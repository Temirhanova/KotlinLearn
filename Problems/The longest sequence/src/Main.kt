import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sum = 1
    var max = 1
    if (n > 0) {
        var a = scanner.nextInt()
        for (i in 1 until n) {
        val b = scanner.nextInt()
            sum = if (a <= b) sum + 1 else 1
            max = if (sum > max) sum else {
                max }
            a = b
        }
    }
    print(max)
}