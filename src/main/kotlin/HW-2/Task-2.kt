package `HW-2`

fun main() {
    println("Input minutes")
    val minutes = readln().toInt()
    if (minutes < 43200){
        println("0, 0")
    }
    else if (minutes == 43200) {
        println("0, 1")
    }
    else {
        val years = minutes / 518400
        val months = years % 10
        println("$years, $months")
    }
}