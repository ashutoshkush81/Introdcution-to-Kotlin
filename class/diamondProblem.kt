// Diamond Problem in Kotlin and how to resolve it.
/*Actual Diamond Problem*/
/*
interface parent1{
    fun foo(){
        println("Parent1:fun foo()")
    }
}
interface parent2{
    fun foo(){
        println("Parent2:fun foo()")
    }
}

class child1: parent1,parent2 {

}

This part of code does not compile
*/

interface parent1{
    fun foo(){
        println("Parent1:fun foo()")
    }
}
interface parent2{
    fun foo(){
        println("Parent2:fun foo()")
    }
}

class child1: parent1,parent2 {
    override  fun foo(){
        println("child1: fun foo()")
    }


}

fun main(){
    var obj = child1()
    obj.foo();
}

