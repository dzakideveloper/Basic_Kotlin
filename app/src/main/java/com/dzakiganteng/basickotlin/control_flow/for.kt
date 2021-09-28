package com.dzakiganteng.basickotlin

fun main() {
    //for ke1
    for (value in 100 downTo 0 step 5)
        println(value)

    val name = "Dzaki Ganteng"
    for (name in name) {
        println("\"$name\"")
    }

    //for ke2
    for (number in 1..5){
        println("Nomor $number")
    }

    //for ke3
    for (i in 1.rangeTo(5)){
        println(i)
    }

    //for ke4
    for (index in (19.downTo(9) step 3)){
        println(index)
    }

    //for ke5
    val range = 1.rangeTo(9)
    range.forEachIndexed {index, value ->
        println("index $index bernilai $value")
    }
}