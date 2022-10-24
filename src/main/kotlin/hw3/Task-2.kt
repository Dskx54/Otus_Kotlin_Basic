
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

    if ( number in 1..99){
        when (number) {
            in 1..10 -> {

            }
            in 10..40 -> {

            }
            in 40..50 -> {

            }
            in 50..90 -> {

            }
            in 90..99 -> {

            }
        }
    }
    else{
        println("The number must be in the range from 1 to 99 ")
    }
}