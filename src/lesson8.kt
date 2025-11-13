fun main(){
    val set: MutableSet<Int> = mutableSetOf(10, 20, 30)
    println(set)
    //追加
    set.add(40)
    println(set)
    //削除
    set.remove(10)
    println(set)
}