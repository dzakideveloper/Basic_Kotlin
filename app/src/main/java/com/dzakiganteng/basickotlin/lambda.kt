package com.dzakiganteng.basickotlin

fun main() {
    val length = messegeLength("Masuka")
    massage()
    printMassage("Masuka $length")
}

val massage = {println("Hello this is lambda")}
val printMassage = {massagee: String -> println(massagee)}
val messegeLength = { massage: String -> massage.length}