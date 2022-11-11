package hw4

import java.util.*

fun factorial(number:Int): Int{
    if (number<=1) return  1
    return number* factorial(number-1)
}

fun main(){
    val input = Scanner(System.`in`)
    println("Enter a number: ")
    val number = input.nextInt()
    println(factorial(number))
}