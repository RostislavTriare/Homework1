package Loops

fun main() {

    var k = 18

    for (i in 1..10) {
        k*=i
        println("Цена за $i = $k")
        k/=i
    }



}