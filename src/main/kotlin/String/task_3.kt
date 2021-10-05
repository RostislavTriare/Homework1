package String


fun main() {

    val s="afksjkgor"
    var str=""
    for(i in 0..s.count()-1){
        str=str+" "+s[i]
    }
    println(str)
}