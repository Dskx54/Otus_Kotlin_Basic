package hw2

import java.util.Scanner

fun main() {
    println("Input three-digit number:")
    val input = Scanner(System.`in`)
    var num = input.nextInt()
    if ( num in 100..999 ){
        var sum = 0
        while(num != 0) {
            val n = num % 10
            sum += n
            num /= 10

        }
        println(sum)
    }
    else{
        println("The number is not a three digit number")
        }

}