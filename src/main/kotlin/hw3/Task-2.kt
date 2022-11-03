
package hw3

import java.util.*
//enum class RomanNumerals{
//    I,
//    V,
//    L,
//    C
//}

fun main(){


    println("Input number")
    val input = Scanner(System.`in`)
    val number = input.nextInt()
    if (number < 100) {
        val firstDigit = when (number / 10) {
            1 -> "X"
            2 -> "XX"
            3 -> "XXX"
            4 -> "XL"
            5 -> "L"
            6 -> "LX"
            7 -> "LXX"
            8 -> "LXXX"
            9 -> "XC"
            else -> {}
        }
        val secondDigit = when (number % 10) {
            0 -> ""
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            else -> {}
        }
        if (number < 10) {
            println("$secondDigit")
        } else {
            println("$firstDigit$secondDigit")
        }
    }
    else {
        println("Your number $number is more than 100")
    }



}