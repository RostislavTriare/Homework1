package Conditional_operator

fun main() {

    val a = 3
    val b = 11
    val c= 7
    val ser:Int

    if (a>b&&a>c){
        if(b<c&&b<a){
            ser=(a+b)/2
            println("Середнє між макс і мін = $ser")
        }else if(c<a&&c<b){
            ser=(a+c)/2
            println("Середнє між макс і мін = $ser")
        }

    }else if(b>c&&b>a){
        if(a<b&&a<c){
            ser=(b+a)/2
            println("Середнє між макс і мін = $ser")
        }else if(c<a&&c<b){
            ser=(b+c)/2
            println("Середнє між макс і мін = $ser")
        }
    }else if(c>a&&c>b){
        if(a<b&&a<c){
            ser=(c+a)/2
            println("Середнє між макс і мін = $ser")
        }else if(b<c&&b<a){
            ser=(c+b)/2
            println("Середнє між макс і мін = $ser")
        }
    }




}