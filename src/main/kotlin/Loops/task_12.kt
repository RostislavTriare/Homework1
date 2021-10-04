package Loops

fun main() {

    val n = 8
    var f1 = 1
    var f2 = 1
    while(n>f2){
        val f=f2
        f2=f1+f2
        f1=f
    }
    if (f2==n){
        println("True")
    }else{
        println("False")
    }
}