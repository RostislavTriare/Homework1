package Loops

fun main() {

    val p = 22F
    var sum = 1000F
    var i = 1

    while (sum<=1100){
        sum=sum*((p/100)+1)
        i=i+1


    }
    println("Кількість місяців  = $i")
    println("Сума = $sum")

}