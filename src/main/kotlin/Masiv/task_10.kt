package Masiv

import java.util.*

fun main() {

    var arr = arrayOf<Array<Int>>()
    val n = arrayOf(1, 10, 1, -1, 5, 1)
    val m = arrayOf(1, 9, 1, 1, 6, 3)


    for (i in 0..5) {
        var array = arrayOf<Int>()
        for (j in 0..5) {
            array += n[i]*m[j]

        }
        arr += array
    }
    val x = arrayOf(0, 0, 0, 0, 0, 0)
    for (i in 0..5)
        for (j in 0..5)
            x[i] =x[i] + arr[i][j]


    println(Arrays.toString(x))
    println()

}