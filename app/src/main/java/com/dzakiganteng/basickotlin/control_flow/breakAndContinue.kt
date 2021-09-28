package com.dzakiganteng.basickotlin

fun main() {
    var sum = 0
    var i = 1
    /*while (i <= 100) {
        sum += i
        i++
        if (sum > 1000) {
            break
        }
    }
    println(sum)*/

    //cara ke2
    while (i <= 100) {
        i++
        if (i%2 != 0) {
            continue
        }
        sum += i
        println(sum)
    }
}