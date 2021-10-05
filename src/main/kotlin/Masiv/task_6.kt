package Masiv

fun main() {


    val arr = arrayOf(90, 556, 45, 9, 89, 7, 6, 1, 44, 10)
    val n = arr.size-1
    var k=0
    for (i in 0..arr.size - 1) {
        if (arr[i]<arr[n]) {
            println(arr[i])
            k=k+1
        }
    }
    if (k==0){
        println(k)
    }
}