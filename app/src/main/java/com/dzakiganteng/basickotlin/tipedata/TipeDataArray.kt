package com.dzakiganteng.basickotlin.tipedata

fun main() {
    val friends : Array<String> = arrayOf("Dimas", "Gharin", "Ahsan")
    friends.set(0, "Harits")
    
    println(friends[0])
    println(friends.size)
}
