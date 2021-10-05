package Masiv

import java.util.*

fun main() {

    var arr = arrayOf<Array<Int>>()
    val n = arrayOf(9, 5, 49, 92, 8, 73)
    val m = arrayOf(90, 1, 4, 9, 89, 7)
    val rez = arrayOf(0, 0, 0, 0, 0, 0)
    val ik = 4
    for (i in 0..5) {
        var array = arrayOf<Int>()
        for (j in 0..5) {
            array += n[i]*m[j]
            if(i == ik) {
                rez[j] = array[j]
            }
        }
        arr += array
    }
    for (array in arr) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
    println()
    println(Arrays.toString(rez))
}