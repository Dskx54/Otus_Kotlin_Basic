package hw3

import java.util.*
import kotlin.math.pow

fun main() {

    val input = Scanner(System.`in`)
    println("Input side A:")
    val aSide = input.nextInt()
    println("Input side B:")
    val bSide = input.nextInt()
    println("Input side C:")
    val cSide = input.nextInt()

    val sides = mutableListOf(
        aSide,
        bSide,
        cSide
    )

    val bigSide = sides.max()
    sides.remove(bigSide)
    val kSide = sides[0]
    val lSide = sides[1]




    if ((aSide + bSide > cSide) && (aSide + cSide > bSide) && (bSide + cSide > aSide)) {

        when {
            bigSide.toFloat().pow(2) == kSide.toFloat().pow(2) + lSide.toFloat().pow(2)
                .pow(2) -> println("The triangle is rectangular")

            bigSide.toFloat().pow(2) < kSide.toFloat().pow(2) + lSide.toFloat().pow(2)
                .pow(2) -> println("The triangle is acute - angled")

            else -> println("The triangle is obtuse")
        }
    }
    else{
        println("The sides of the triangle are set incorrectly - " +
                "the sum of the two sides must be less than the third side")
    }
}