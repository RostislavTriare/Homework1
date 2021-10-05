package Masiv

import java.util.*

fun main() {

    var arr = arrayOf<Array<Int>>()
    val n = arrayOf(9, 5, 49, 92, 8, 73)
    val m = arrayOf(90, 1, 4, 9, 89, 7)

    val k = arrayOf(0, 0, 0 , 0 , 0 , 0)
    for (i in 0..5) {
        var array = arrayOf<Int>()
        for (j in 0..5) {
            array += n[i]*m[j]

        }
        arr += array
    }
    for (array in arr) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
    println("Результат - ")
    for (i in 0..5){
        for (j in 0..5) {
            if(j%2!=0) {
                print(arr[i][j])
                print(" ")
            }

        }
        println()
    }
        println()
    }





