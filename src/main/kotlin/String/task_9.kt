package String

fun main() {

    val s = "fhoykpqfpf dlf[l  [pwl weerrr"
    val c=' '
    var a =0
    for(i in 0..s.count()-1) {
        if(s[i]==c){
            a = a+1
        }

    }
    println(a)

}