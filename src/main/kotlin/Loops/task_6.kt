package Loops

fun main() {

    val n = 10
    var a1 = 1
    var a2 = 2
    var a3 = 3

    println("1 - $a1 2- $a2  3-$a3")
    for(i in 4..n){
        val a=a3
        a3=a3+a2-2*a1
        a1=a2
        a2=a
        println(a3)
    }

}