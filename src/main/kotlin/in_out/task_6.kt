package in_out


fun main() {

    val a: Byte = 7
    val b: Byte = 8
    val c: Byte = 17
    val v:Int =a*b*c
    val s:Int =2*(a*b+b*c+c*a)

    println("Обьем = $v \nПлоща= $s")
}