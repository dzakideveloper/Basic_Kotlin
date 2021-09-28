package com.dzakiganteng.basickotlin.collection

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    val fullKey = capital.keys
    val fullValues = capital.values
    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Dayeuh", "Mars")
    mutableCapital.put("Makassar", "Indonesia")

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))
    println(fullKey)
    println(capital)
    println(mutableCapital)
}