package in_out


fun main() {

    var a = 10
    var b = 15
    var c = 1

    a =b.also{ b = a }
    a =c.also{ c = a }

    println("A = $a B= $b C= $c")


}