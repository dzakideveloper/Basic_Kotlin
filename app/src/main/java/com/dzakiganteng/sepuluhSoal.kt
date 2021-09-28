package com.dzakiganteng

import com.dzakiganteng.basickotlin.dataOrg

/*
fun main() {
    val text: String = "RPL IDN Boarding School"
    val angka: Int = 2021
    text.length

    println(text) // ekspektasi output "RPL IDN Boarding School"
    println(angka) // ekspektasi output 2021
}*/

fun main() {
    print(calculator())
}

// penjumlahan +
// pengurangan -
// pembagian /
// perkalian *
// modulus %

fun calculator() {
    val jamParkir : Int = readLine()!!.toInt()
    val a : Int = 1
    when(jamParkir) {
        1 -> println("$a + $a")
        2 -> println(a - a)
        3 -> println(a / a)
        4 -> println(a * a)
        5 -> println(a % a)
        else -> println("Operator tidak dikenali program")
    }
}

/*fun main() {
    val nilaiMatematika = 88
    val nilaiIngris = 93
    val nilaiSejarah = 75
    val nilaiKomputer = 40

    predikat(nilaiMatematika)
    predikat(nilaiIngris)
    predikat(nilaiSejarah)
    predikat(nilaiKomputer)
}

fun predikat(text : Int) {
    if (text >= 90){
        println("Predikat A dengan nilai : $text")
    }else if (text >= 80){
        println("Predikat B dengan nilai : $text")
    }else if (text >= 70){
        println("Predikat A dengan nilai : $text")
    }else{
        println("Maaf kamu tidak lulus dengan nilai : $text")
    }
}*/

/*fun main() {
    val array : Array<String> = arrayOf(
        "2021/2022 ",
        "Ajaran ",
        "Bidang ",
        "Tahun ",
        "RPL ",
        "Boarding School ",
        "Android ",
        "IDN ",
        "Developer ",
        "SMK ")

    print(array[9])
    print(array[7])
    print(array[5])
    print(array[3])
    print(array[1])
    print(array[0])
    print(array[2])
    print(array[4])
    print(array[6])
    print(array[8])
}*/

/*data class PemainBola(val nama : String, val umur : Int)

fun main() {
    val persija = PemainBola ("Riko Simanjuntak", 28)
    println(persija)
}*/

/*fun main() {
    val tugasIni = mutableListOf("IDN", 1.0 ,"Android Dev", true)
    println(tugasIni)
    tugasIni[1] = 2.0
    println(tugasIni)
}*/

/*fun main() {
    val satu : Array<Any> = arrayOf("Michael, ", "20, ")
    val dua : Array<Any> = arrayOf("Hygra, ", "22, ")
    val tiga : Array<Any> = arrayOf("Slovoski, ", "21, ")
    val empat : Array<Any> = arrayOf("Mohamad", 19)

    print(satu[1])
    print(dua[1])
    print(tiga[1])
    println(empat[1])

    print(satu[0])
    print(dua[0])
    print(tiga[0])
}*/

/*fun main() {
    val data : Array<Any> = arrayOf("idn, ", "2, ", "3, ", "4, ", "5, ", "7, ", "idn, ", "8, ", "9, ", "10, ", "idn, ", "12, ", "idn, ", "14, ", "15, ", "16, ", "idn, ", "18, ", "idn, ", "20")
    print(data[0])
    print(data[1])
    print(data[2])
    print(data[3])
    print(data[4])
    print(data[5])
    print(data[6])
    print(data[7])
    print(data[8])
    print(data[9])
    print(data[10])
    print(data[11])
    print(data[12])
    print(data[13])
    print(data[14])
    print(data[15])
    print(data[16])
    print(data[17])
    print(data[18])
    print(data[19])
}*/
