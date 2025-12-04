class ClassA {
    val propA = "The property of ClassA"
}

class classB {
    val instanceA = ClassA()
    fun methodB() {
        println(instanceA.propA)
    }
}

class ClassC {
    val instanceA = classA()
    fun methodC() {
        println(instanceA.propA)
    }
}

fun main(){
    classB = classB()
    classB.methodB()
}

    
