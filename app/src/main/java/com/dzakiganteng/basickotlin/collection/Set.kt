package com.dzakiganteng.basickotlin.collection

fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 3, 4, 5)
    println(setA == setB)

    //union & intersect
    val setAa = setOf(1, 2, 4, 2, 1, 5)
    val setC = setOf(1, 5, 7)
    val union = setAa.union(setC)
    val intersect = setAa.intersect(setC)

    println(union)
    println(intersect)


}