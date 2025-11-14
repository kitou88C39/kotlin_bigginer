fun main(){

    val num = 5

    when(num) {
        5 -> println("num = 5")
        6, 7 -> println("num = 6 or 7")
        in 8..10 -> println("num between 8 ~ 10")
        !in 11..15 -> println("num not between 11 and 15")
        else -> {
            println("その他")
            println("当てはまりません")
        }
    }

    val num: Any = 50.0
    when(num){
        is Int -> println("Int")
        is Double -> println("Double")
        is String -> println("String")
    }

    when str:Any = when(num){
        5 -> "num = 5"
        6, 7 -> "num = 6 or 7"
        in 8..10 -> "num between 8 ~ 10"
        !in 11..15 -> "num not between 11 and 15"
        else -> {
            println("その他")
            "当てはまりません"
        }
    }
    println(str)
}