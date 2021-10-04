package Conditional_operator

fun main() {

    val a = 8
    val b = 1
    val c= 7
    if (a<b&&a<c){
        println("$a")
    }else if(b<c&&b<a){
        println("$b")
    }else if(c<a&&c<b){
        println("$c")
    }

}