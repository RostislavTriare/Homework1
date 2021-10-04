package Conditional_operator

fun main() {

    var a = 8
    var b = 12
    if (a!=b){
        a=a+b
        b=a
        println("$a \n $b")
    }else {
        a=0
        b=0
        println("$a \n $b")
    }

}