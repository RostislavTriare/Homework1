package Loops

fun main() {

    var a = 12
    var b = 6
    while(a!=0&&b!=0){
        if(a>b){
            a=a%b
        }else{
            b=b%a
        }

    }
    println(a+b)
}