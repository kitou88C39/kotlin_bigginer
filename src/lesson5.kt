fun main(){

    val str: String? = null

    // !!
    val list: MutableList<String?> = mutableListOf(10, 20, 30)
    val num: Int? = list.min()

    // スマートキャスト
    if(num != null){
        println(num * 2)
    }
    // !!
    val num2: Int = num!!
    println(num2 * 2)
}