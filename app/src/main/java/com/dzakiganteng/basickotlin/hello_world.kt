package com.dzakiganteng.basickotlin.basic

fun main() {
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
    print(mainn())
}

fun mainn() : String {
    val paik = " baek"
    print("paik")
    return paik
}