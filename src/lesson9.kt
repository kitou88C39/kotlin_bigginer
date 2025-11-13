fun main(){

    val map:MutableMap<String, String> = mutableMapOf<String, String>(
        "orange" to "みかん",
        "apple" to "りんご",
        "peach" to "もも"
    )
    
    //変更
    map["apple"] = "りんご"
    println(map)
    //追加
    map["banana"] = "バナナ"
    println(map)
    //削除
    map.remove("peach")
    println(map)

}