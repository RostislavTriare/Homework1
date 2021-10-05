package Masiv

fun main() {


    val arr = arrayOf(90,6,45,0,89)
    var k=0
    for (i in 0..arr.size-1){
        if (arr[i]%2!=0){
            println(arr[i])
            k=k+1
        }
    }
    println("Кількість непарних чисел = $k")




}