package String



fun main() {

    val n = "1233788"

    var a = 0
    for(i in 0..n.count()-1 ) {
        a += n[i].toInt() - 48

    }
println(a)

}