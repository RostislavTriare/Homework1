package Conditional_operator

fun main() {

    val a = 8
    val b = 100
    val c= 7
    if (a<b&&a<c){
        println(b+c)
    }else if(b<c&&b<a){
        println(a+c)
    }else if(c<a&&c<b){
        println(b+a)
    }

}