package com.dzakiganteng.basickotlin.control_flow

fun main() {
    var x = 1
    when(x){
        1 -> println("X = 1")
        2 -> println("X = 2")
        else -> {
            println("X tidak memiliki nilai")
        }
    }

    var nilaiAkhir = 'A'
    when(nilaiAkhir){
        'A', 'B', 'C' -> println("Kamu lulus ujian dengan hasil $nilaiAkhir")
        else ->{
            println("Kamu gagal dengan predikat $nilaiAkhir")
        }
    }

    val nilaiAkhirUjian = 'D'
    val nilaiLulus = arrayOf('A', 'B', 'C')
    when(nilaiAkhirUjian){
        in nilaiLulus -> println("Kau lulus!")
        !in nilaiLulus -> println("Coba lagi!")
    }

    val ujianPertengahan = 70
    when{
        ujianPertengahan >= 90 -> println("Anda pelajar terbaik!")
        ujianPertengahan >= 80 -> println("Nilai anda cukup")
        else -> println("Belajar lagi ya...")
    }
}