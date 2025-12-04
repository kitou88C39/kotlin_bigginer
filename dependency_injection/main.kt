class ClassA(private val id: Int) {
    val propA = "The property of ClassA"
}

class classB(private val instanceA: ClassA) {
    //val instanceA = ClassA(10)
    fun methodB() {
        println(instanceA.propA)
    }
}

class ClassC(private val instanceA: ClassA)  {
    //val instanceA = classA(10)
    fun methodC() {
        println(instanceA.propA)
    }
}

fun main(){
    classB = classB()
    classB.methodB()
}

    
