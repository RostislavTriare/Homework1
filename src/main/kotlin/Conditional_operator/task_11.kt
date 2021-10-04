package Conditional_operator

fun main() {

    val x = 1

    if (x<=0){
        println(-x)
    }else if(x>0&&x<2){
        println(x*x)
    }else{
        println(4)
    }

}