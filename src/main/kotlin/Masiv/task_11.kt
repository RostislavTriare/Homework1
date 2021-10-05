package Masiv



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
    var min:Int = arr[1][1]
    for (array in arr) {
        for (value in array) {
            print("$value ")
        }
        println()
    }

    for (i in 0..5) {
        min = arr[i][0]
        for (j in 0..5) {
            if (min>arr[i][j]){
                min=arr[i][j]
        }
    }
    println("Min $i рядка =$min")
        }




    println()

}