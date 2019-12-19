//How to pass the function as parameter and how to take function as parameter.

fun dothis():Unit{
    println("Dothis function invokes")
}

fun executor(action:()->Unit){  //()-> is declare a function. Unit is return type.
    println("Executor function invokes")
    action.invoke() //right way to calling a function from function.
    action()  //This is another way to calling a function from function.
}

fun main(){
    executor(::dothis)//:: is used to pass the function as parameter.
}