fun main() {
//    var UTS:Int = 95
//    var UAS:Int = 90

    print("UTS = ")
    val UTS : Int = readLine()!!.toInt()

    print("UAS = ")
    val UAS : Int = readLine()!!.toInt()


    var hasil:Double = (UTS * 0.4) + (UAS * 0.5)

    println("Nilai Ujian Anda = $hasil")

    if (hasil > 80){
        println("Anda Naik Semester")
    } else{
        println("Anda Harus Cuti")
    }
}