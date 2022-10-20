package hw2

import java.math.RoundingMode
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println("Input A: ")
    val input = Scanner(System.`in`)
    val aSide = input.next().toInt()
    println("Input B: ")
    val bSide = input.next().toInt()
    if (aSide <= 0){
        println("A cannot be equal to zero")
    }
    else if (bSide == 0){
        println("B cannot be equal to zero")
    }

    val result = sqrt(aSide.toDouble().pow(2) + bSide.toDouble().pow(2))
    println("${result.toBigDecimal().setScale(3, RoundingMode.UP)}")
}
