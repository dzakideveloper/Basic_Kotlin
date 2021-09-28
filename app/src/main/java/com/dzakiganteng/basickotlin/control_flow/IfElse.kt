package com.dzakiganteng.basickotlin.control_flow

fun main() {
    val nilaiUjian = 89
    if (nilaiUjian > 89){
        println("Kamu mendapatkan nilai A dengan nilai $nilaiUjian")
    }
    else if (nilaiUjian >= 80){
        println("Kamu mendapatkan nilai B dengan nilai $nilaiUjian")
    }else if (nilaiUjian >= 70){
        println("Kamu mendapatkan nilai C dengan nilai $nilaiUjian")
    }
    else{
        println("Kamu gagal ujian dengan nilai $nilaiUjian")
    }
}