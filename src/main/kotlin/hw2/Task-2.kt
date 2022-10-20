package hw2
import java.util.*

fun main() {
    val minutesInmonth = 43200
    val minutesInyear = 518400
    println("Input minutes")
    val input = Scanner(System.`in`)
    when (val minutes = input.nextInt()) {
        in 0 until minutesInmonth -> {
            println("0, 0")
        }
        minutesInmonth -> {
            println("0, 1")
        }
        else -> {
            val years = minutes / minutesInyear
            val months = years % 10
            println("$years, $months")
        }
    }
}