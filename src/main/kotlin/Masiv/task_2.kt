package Masiv

import java.util.*
import kotlin.math.roundToInt

fun main() {

    val n = 6
    val arr = arrayOf(0,0,0,0,0,0)
    for (i in 0..n-1) {
        val k = i.toDouble()
        arr[i]= Math.pow(2.00,k).roundToInt()
    }
    println(Arrays.toString(arr))



}