package com.dzakiganteng.basickotlin

fun main() {
    val number = intArrayOf(10,20,30)
    val number1 = sumNumbers(10, 20, 30, 40, 50, *number)

    print(number1)
}

fun sumNumbers(vararg number1: Int): Int{
    return number1.sum()
}