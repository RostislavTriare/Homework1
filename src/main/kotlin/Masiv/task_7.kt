package Masiv

fun main() {


    val arr = arrayOf(90, 556, 4, 9, 89, 7)

    var k=arr[0]
    for (i in 1..arr.size - 1 step 2) {
        if(arr[i]>arr[i-1]){
            k = arr[i-1]
    }

}
    println(k)
}