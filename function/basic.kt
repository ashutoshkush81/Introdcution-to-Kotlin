import kotlin.text.split as split1

fun voidreturn(msg:String, total:Int):Unit{
//    instead of Unit we don't need to compulsory write :unit
    for(i in 1..total){
        println("Message is : $msg")
    }
}

fun intreturn(arr:List<Int>):Int{ // We can return any type of function
    var total = 0;
    for(i in arr){
        total+=i
    }
    return total ;
}

fun sum(a:Int,b:Int)=a+b

fun varargs(vararg va :Int){
    va.forEach { i->print("$i ") }
    println("")
}

class Person(val name:String){
    fun say(message:String){
        println("$name say $message")
    }
    infix fun says(message:String){
        println("$name say $message")
    }
}

fun main(args : Array<String>){
//    How to return void in function
    voidreturn("Hello World !",3)
//    Return Int from function
    var ans : Int = intreturn(listOf(1,2,3,4,5,6));
    println(ans)
//    Single Expression Functions
    println(sum(1,2))
//    Variable number of arguments
    varargs(1,2,3,4,6,7)
    varargs(23,43,546,2,23,32)
//    infix function
    var ashutosh = Person("Ashutosh")
    ashutosh.say("Hello There")  //This is without infix function
    ashutosh says "Hello Theres"  //This is calling infix function

}