package com.dzakiganteng.basickotlin

class dataOrg(val names : String, val ages : Int){
    override fun toString(): String {
        return "DataOrang(name=$names, age=$ages)"
    }
}
data class dataMarga(val name : String, val age : Int)

fun main() {
    val org = dataOrg ("Garin", 15)
    val dataMarga = dataMarga("Sinulinggis", 1000)

    println(org)
    println(dataMarga)

    //equal
    val data1 = dataMarga("paiq", 5)
    val data2 = dataMarga("paiq", 5)
    val dataGaje = dataOrg("garin", 6)

    //copy
    val dataCopy = data1.copy()

    println(data1.equals(data2))
    println(data1.equals(dataGaje))
    println(dataGaje)

    val name = data1.component1()
    println("$name adalah component 1 dari variable data1")
}

