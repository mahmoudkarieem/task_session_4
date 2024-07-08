//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name ="   Kotlin"
    val result=name.length

    println(" result =$result")


    println()
    val result2=name.substring(1,4)

    println(" result2 =$result2")
    println()
    val result3=name.take(2)

    println("result3 =$result3")
    println()
    val result4=name.contains('m')

    println("result3 =$result3")

    println()
    val result5=name.isEmpty()

    println("result5 =$result5")
    println()

    val result6=name.indexOf('A')

    println("result6 =$result6")
    println()

    val result7=name.trim()

    println("result7 =$result7")
    println()
    plusFun(2,
        4)
    println()
    minusFun(7,2)
    println()
    multiplyFun(4,5)
    println()
}
fun plusFun(num1:Int,num2:Int){
    println("num1+num2 =${num1+num2}")
}
fun minusFun(num1:Int,num2:Int){
    println("num1-num2 =${num1-num2}")
}
fun multiplyFun(num1:Int, num2:Int){
    println("num1*num2 =${num1*num2}")
}