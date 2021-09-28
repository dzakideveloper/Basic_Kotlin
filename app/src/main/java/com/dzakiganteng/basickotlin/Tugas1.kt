package com.dzakiganteng.basickotlin

/*fun main() {
    print("Hours: ")
    val hours = readLine()!!.toInt()
    println(hours/24 * 15 + (if (hours >= 24) 0 else Math.min(hours,5)) + Math.max(hours%24 - (if (hours > 24) 0 else 5), 0) * 0.5)
}*/

fun main() {
    print("Jam parkir ")
    val jamParkir = readLine()!!.toInt()
    when(jamParkir) {
        in 1..5 -> println("Bayar parkir sebanyak \$${jamParkir * 1.0}")
        in 6..23 -> println("Bayar parkir sebanyak \$${((jamParkir - 5.0) * 0.5) + 5}")
        else -> println("Bayar parkir sebanyak \$${(jamParkir % 24.0) * 0.5 + (jamParkir/24 * 15)}")


    }
}