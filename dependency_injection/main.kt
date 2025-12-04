class ClassA {
    val propA = "The property of ClassA"
}

class classB {
    val instanceA = ClassA()
    fun methodB() {
        println(instanceA.propA)
    }
}

fun main(){
    classB = classB()
    classB.methodB()
}

    
