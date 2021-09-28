package com.dzakiganteng.basickotlin.collection

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c', 'd')
    val anyList = listOf('a', "Kotlin", 3, true)

    println("APA $charList")
    println(anyList[3])


    val anyyList = mutableListOf('a', "Kotlin", 3, true)
    anyyList.add('d')
    println(anyyList)
    anyyList.add(1, "My")
    println(anyyList)
    anyyList[3] = false
    println(anyyList)
    anyyList.removeAt(1)
    println(anyyList)
}


