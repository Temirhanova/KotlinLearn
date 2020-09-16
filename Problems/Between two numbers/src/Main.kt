import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()
    print(one in two..three)
}