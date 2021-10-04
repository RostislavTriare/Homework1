package String


fun main() {

    val s:Array<Char> = arrayOf('a','b','o','n','t')
    var str=""
    for(i in 0..s.size-1){
        str=str+" "+s[i].toString()
    }
    println(str)
}