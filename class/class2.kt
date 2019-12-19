import outerClass.anothernestedClass as anothernestedClass

//This is about how to declare a nested class and how to use the variable of outer class in inner class
// and when can we use the outer variable and how.
//Nested class can’t access the members of outer class,
// but we can access the property of nested class from the outer class without creating object for nested class.
class outerClass {
    var str = "Outer class"
    fun outerfun(){
        println("Your are in outerclass and value of str is $str")
    }

    // nested class declaration (inner is not added so we can't access the variable of outer class.
    class nestedClass {
        var s1 = "Nested class"
        // nested class member function
        fun nestfunc(str2: String): String {
            var s2 = s1.plus(str2)
            return s2
        }
    }
    inner class anothernestedClass{
        var s1 = str;
        fun anothernestedfunc(str2: String):String{
            var s2 = s1.plus(" + anothernestclass")
            s2 = s2.plus(str2)
            return s2;
        }
    }
}
fun main(){
    var obj = outerClass()
    obj.outerfun()
    var obj1 = outerClass.nestedClass()
    println(obj1.nestfunc(" Successful"))
    var obj2 = outerClass().anothernestedClass()
    println(obj2.anothernestedfunc(" Successful"))

}
