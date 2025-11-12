fun main(){
    //型推論 : 代入する値で自動的にデータ型を識別する
    val x = 10
    val y = 1.0
    val z = "Hello"
    println("x = ${x::class}")
    println("y = ${y::class}")
    println("z = ${z::class}")
}