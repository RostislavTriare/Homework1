package Conditional_operator

fun main() {

    val x = 2000

    if(x%4==0){
        if(x%100==0){
            if(x%400!=0){
                println("365")
            }else{
                println("366")
            }
        }else{
            println("366")
        }
    }else{
        println("365")
    }

}