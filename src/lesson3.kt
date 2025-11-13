fun main(){
    //型推論 : 代入する値で自動的にデータ型を識別する
    val x = 10
    val y = 1.0
    val z = "Hello"
    println("x = ${x::class}")
    println("y = ${y::class}")
    println("z = ${z::class}")
    //整数
    val num1:Int = 10 //32bit
    val num2:Long = 10 //64bit
    val num3:Short = 10 //16bit
    val num4:Byte = 10 //8bit
    //小数

}