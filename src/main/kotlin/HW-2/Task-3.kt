package `HW-2`

import kotlin.math.pow

fun main() {
    println("Input A")
    val a_side = readLine()!!.toInt()
    println("Input B")
    val b_side = readLine()!!.toInt()
    val result = a_side.toFloat().pow(2) + b_side.toFloat().pow(2)
    println("$result")
}
