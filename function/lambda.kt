//How to declare lambda function.
/*
Lambdas and anonymous functions are called function literals. These are functions that
are not declared but, rather, passed immediately as an expression—more often than not,
to a higher order function. Because of this they don’t need a name.
*/
fun execute(fun1:(it:String)->Unit){
    fun1("World")
}

fun execute1(sum:(it1:Int,it2:Int)->Unit){
    sum(1,5)
}





fun main(args:Array<String>){
    execute({println("Hello $it")})
    execute1({it1,it2->println(it1+it2)})
}
