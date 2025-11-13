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
    val num5:Float = 1.0f //32bit
    val num6:Double = 1.0 //64bit
    //整数符号なし
    val num: UByte = 127U
    //新数表現
    val num = 0xF0
    val num1 = 0b11110000
    //文字列、文字
    val str: String = "Hello"
    val ch: Char = 'H'
    //真偽値
    val bool: Boolean = true
    //Any
    var any: Any = 10
    any = "Hello"

}