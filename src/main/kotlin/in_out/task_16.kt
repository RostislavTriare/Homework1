package in_out

fun main() {

    val x1 = 10
    val x2 = 15
    val y1 = 9
    val y2 = -6
    val p =2*(Math.abs(x2-x1)+Math.abs(y2-y1))
    val s =Math.abs(x2-x1)*Math.abs(y2-y1)

    println("Периметр =$p Площа = $s")
}