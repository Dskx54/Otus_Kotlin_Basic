package hw4

import java.util.*

fun palindrom (number: Int): Boolean {
    return if (number.toString().length <= 2 && number.toString().first() == number.toString().last()){
        true
    }
    else if (number.toString().first() == number.toString().last()){
        val numbRec = number.toString().drop(1).dropLast(1)
        palindrom(numbRec.toInt())
    }
    else{
        false
    }
}

fun main(){
    val input = Scanner(System.`in`)
    println("Enter a number: ")
    val number = input.nextInt()
    println(palindrom(number))
}




