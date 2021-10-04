package String

fun main() {

    val s:Array<Char> = arrayOf('a','6','o','9','t')
    val non:Array<Char> = arrayOf('1','2','3','4','5','6','7','8','9')
    var k=0
    for(i in 0..s.size-1){
      for(j in 0..non.size-1){
          if(s[i]==non[j]){
              k=k+1
          }
      }
    }
    println("Кількість натуральних чисел рядка = $k")
}