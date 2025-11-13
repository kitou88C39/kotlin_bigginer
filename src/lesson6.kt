fun main(){

    //配列
    val array:Array<Int> = arrayOf<Int>(10, 20, 30)
    println(array[0])
    println(array[1])
    println(array[2])

    val array1 : intArray = intArray(10, 20, 30)
    println(array1[0])
    println(array1[1])
    println(array1[2])

    val array2 = doubleArrayOf(10.0, 20.0, 30.0)
    println(array2[0])
    println(array2[1])
    println(array2[2])

    val array3: Array<String?> = arrayOfNulls<String>(3)
    array3.foreach { println(it) }

    }