import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val studentsCount = scanner.nextInt()
    var dCount = 0
    var cCount = 0
    var bCount = 0
    var aCount = 0
    repeat(studentsCount) {
        val grade = scanner.nextInt()
        if (grade == 2) dCount++
        if (grade == 3) cCount++
        if (grade == 4) bCount++
        if (grade == 5) aCount++
    }
    print("$dCount $cCount $bCount $aCount")
}