package hw3

import java.util.*
import java.time.LocalDate
import java.time.Period
import java.time.YearMonth

fun main() {
    println("Input month")
    val input = Scanner(System.`in`)
    val inputMonth = input.nextInt()
    println("Input day")
    val inputDay = input.nextInt()


    if (inputDay <= 0 || inputMonth <= 0) {
        println("A day or month cannot be less than or equal to zero")
    }
    else if (inputMonth > 12){
        println("A month cannot be greater than 12")
    }
    else {

        val yearMonthObject = YearMonth.of(2020, inputMonth)
        val dayInMouth = yearMonthObject.lengthOfMonth()
        if (inputDay > dayInMouth) {
            println("The number of days entered cannot exceed $dayInMouth")
        } else {
            val date1: LocalDate? = LocalDate.parse(
                "2020-${
                    if (inputMonth < 10) "0$inputMonth" else {
                        inputMonth
                    }
                }-${if (inputDay < 10) "0$inputDay" else inputDay}"
            )
            val date2: LocalDate? = LocalDate.parse("2021-01-01")
            val result: Period? = Period.between(date1, date2)

            println("$result")
        }
    }
}