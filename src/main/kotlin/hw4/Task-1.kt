package hw4

import java.util.*

fun palindorm (number: Int): Boolean {
    if (number.toString().first() == number.toString().last()){
        println("true")
        return true
        palindorm(number.toString().substring(1, number.toString().length -1).toInt())
    }
    else{
        println("false")
        return false
    }
}

fun main(){
    val input = Scanner(System.`in`)
    println("Enter a number: ")
    val number = input.nextInt()
    palindorm(number)
}




