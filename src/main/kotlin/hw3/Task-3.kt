package hw3

import java.util.*
import kotlin.math.pow

fun main(){
    val input = Scanner(System.`in`)
    println("Input side A:")
    val aSide = input.nextInt()
    println("Input side B:")
    val bSide = input.nextInt()
    println("Input side C:")
    val cSide = input.nextInt()
    if (aSide <= 0 || bSide <= 0 || cSide <= 0){
        println("The sides of a triangle cannot be less than or equal to zero")
    }
    else {
        val sides = mutableListOf<Int>(
            aSide,
            bSide,
            cSide
        )
        val bigSide = sides.max()
        val bigSideSquare = bigSide.toDouble().pow(2.0)
        sides.removeIf{it == bigSide}
        val restSidesSumSquare = sides[0].toDouble().pow(2.0) + sides[1].toDouble().pow(2.0)
        if (bigSideSquare > restSidesSumSquare){
            println("The triangle is obtuse")
        }
        else if (bigSideSquare == restSidesSumSquare){
            println("The triangle is rectangular")
        }
        else{
            println("The triangle is acute - angled")
        }


    }
}