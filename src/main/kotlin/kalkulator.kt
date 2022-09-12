fun main() {
    print("Masukan Nama Anda : ")
    val nama : String? = readLine()
    print("Nama : $nama")

    println("")

    println("Kalkutator $nama")

    println(" ")

    print("Nilai1 = ")
    val Niali1 : Double = readLine()!!.toDouble()
    print("Nilai2 = ")
    val Niali2 : Double = readLine()!!.toDouble()



    println("Anda Akan Melakukan Operasi")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")

    val hasil1 : Double = Niali1+Niali2
    val hasil2 : Double = Niali1-Niali2
    val hasil3 : Double = Niali1*Niali2
    val hasil4 : Double = Niali1/Niali2

    print("Operasi (1 - 4) = ")
    var number:Int = readLine()!!.toInt()
    when (number) {
        1 ->
            println("Hasil Penjumlahannya  = $hasil1")
        2 ->
            println("Hasil Pengurangannya  = $hasil2")
        3 ->
            println("Hasil Perkaliannya  = $hasil3")
        4 ->
            println("Hasil Pembagiannya  = $hasil4")
    }
}