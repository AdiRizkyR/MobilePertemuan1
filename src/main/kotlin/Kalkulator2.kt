fun main() {
    println("Kalkutator")

    println(" ")

    print("Nilai 1 = ")
    val Niali1 : Double = readLine()!!.toDouble()
    print("Nilai 2 = ")
    val Niali2 : Double = readLine()!!.toDouble()
    print("Nilai 3 = ")
    val Niali3 : Double = readLine()!!.toDouble()



    println("Anda Akan Melakukan Operasi")
    println("A. Niali 2 + Niali 3")
    println("B. Niali 2 / Niali 3")
    println("C. Niali 1 * Niali 3")
    println("D. Niali 3 - Niali 1")

    val hasilA : Double = Niali2+Niali3
    val hasilB : Double = Niali2/Niali3
    val hasilC : Double = Niali1*Niali3
    val hasilD : Double = Niali3-Niali1

    print("Operasi (A - D) = ")
    val huruf : String? = readLine()
    when (huruf) {
        "A", "a" ->
            println("Hasil Penjumlahannya  = $hasilA")
        "B", "b" ->
            println("Hasil Pengurangannya  = $hasilB")
        "C", "c" ->
            println("Hasil Perkaliannya  = $hasilC")
        "D", "d" ->
            println("Hasil Pembagiannya  = $hasilD")
        else ->
            println("Pilihan $huruf Salah!! ")
    }
}