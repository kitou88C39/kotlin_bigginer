fun main(){

    val list: MutableList<Int> = mutableListOf(10, 20, 30)
    println(list[0])

    //変更
    list[0] = 100
    println(list[0])

    //追加
    list.add(40)
    println(list)

    list.add(0, 500)
    println(list)

    //削除
    list.removeAt(0)
    println(list)

    list.removeAt(100)
    println(list)
}