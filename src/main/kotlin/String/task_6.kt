package String

import java.util.*


fun main() {

    val n = 12337
    val s = listOf(1,1,1,1,1)
    val k:List<Int>

        k = s.map{it*n%10}
        println(k)






}