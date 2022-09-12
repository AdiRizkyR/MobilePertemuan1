fun main(args: Array<String>) {
    print("Number = ")
    var number:Int = readLine()!!.toInt()
    when (number){
        3, 4, 5 ->
            println("it's is summer season")
        6, 7, 9 ->
            println("It is rainy season")
        8, 10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }
}