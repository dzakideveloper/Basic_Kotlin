package com.dzakiganteng.basickotlin

fun main() {
    //membuat null & melakukan pengecekan if else
    /*val b = null
    if (b != null){
        println(b)
    } else{
        print("Kosong")
    }*/

    //Savecall
    var c : String? = null
    println(c?.length)

    //Elvis operator
    val b : String? = null
    /*val l : Int = if (b != null) b.length else -1
    println(l)*/

    val l = b?.length ?: -1

    //!! code operator
    val s : String? = null
    println(s!!.length)
}