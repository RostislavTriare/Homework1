package in_out

fun main() {

    var a = 10
    var b = 15

    a =b.also{ b = a }


    println("A = $a B= $b")
}