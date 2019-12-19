//In Kotlin, when we declare a variable like
//var str: String = "Hello"
//str = null // won't work
//we will never be able to set the value of this variable to null. We may assign it a
//different String value, but Kotlin guarantees that str will never be null. If, for some
//reason, you really need this variable to be null, you have to explicitly tell Kotlin that str
//is a Nullable type. To make a String (or any type) Nullable, we use the question mark
//symbol as postfix to the type, like
//var str: String? = "Hello"
//After declaring a type as Nullable, we now have to do some things that Kotlin used
//to do for us. For non-Nullable types, Kotlin ensures that it’s pretty safe to use them in
//operations such as assignment, printing, inclusion in expressions, etc. When we make
//types Nullable, Kotlin assumes that we know what we’re doing and that we’re responsible
//enough to write the necessary guard conditions to prevent NullPointerExceptions.

fun printArr(arr : Array<Int>?){ //We’re declaring Array<Int> to be Nullable. This means we can pass null to printArr().
    if(arr!=null){
        arr.forEach { i->print("$i ")}
    }
}

//Kotlin introduced an operator that we can use to handle Nullable types. It’s called the
//safe-call operator, which is written as the question mark symbol followed by a dot ?.
fun printArr1(arr : Array<Int>?){
    arr?.forEach { i->print("$i ") }
}

fun printArr2(){
    var arr = arrayOf("Ashutosh",null,"Kushwaha",null,"null")
    var newlist = listOf<String>()
    var newlist1 = listOf<String>()
    for(i in arr){
        i?.let({newlist = newlist.plus(i)})
        i?.run({newlist1 = newlist1.plus(this)})
        i?.also({i->print("$i ")})
    }
    for(i in newlist)
        println(i)
    for(i in newlist1)
        println(i)
}

fun main(){
    var str :  String = "Hello World" //non-null type string declaration
//    str = null (Null can't be a value of non-null type String
//    Then how to declare the null -type variable
    var str1 : String ? = "Hello World" //null-able type string declaration
    str1 = null
    println("$str and $str1")
//    Another example in which developer need to handle the explicitly null exceptions
    var arr = arrayOf(1,32,45)
    printArr(null)
//    Safe call operator
    printArr1(null)
//   let() method –
//To execute an action only when a reference holds a non-nullable value, we can use a let operator.
// The lambda expression present inside the let is executed only if the variable firstName is not null.
    printArr2()

}