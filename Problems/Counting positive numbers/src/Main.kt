import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val times = scanner.nextInt()
    var count = 0
    repeat(times) {
        val number = scanner.nextInt()
        if (number > 0) {
            count++
        }
    }
    println(count)

}