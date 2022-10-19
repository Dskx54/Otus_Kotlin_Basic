package `HW-2`

fun main() {
    println("Input:")
    var num = readLine()!!.toInt()
    var sum = 0
    while(num != 0) {
        val n = num % 10
        sum += n
        num /= 10
    }
    println(sum)
}