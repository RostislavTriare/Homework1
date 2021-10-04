package Int_Number

fun main() {

    var a = 178
    val b:Int=a/100
    val c:Int=a/10-b*10

    a=a-b*100-c*10
    a=a+c*100+b*10



    println("Число = $a ")

}