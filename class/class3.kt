//property initializer, getter and setter are optional.
// We can also omit property type if it can be inferred from the initializer.
//In Kotlin, setter is used to set the value of any variable and getter is used to get the value.
// Getters and setters are auto-generated in the code.
class company{
//    Varibale declaration
    var name : String = ""
    
    var salary : Int = 0
    var department : String = ""
    get() = field
        set(value){
        field = value
    }
}

fun main(args: Array<String>){
    var obj = company()
    obj.name = "Ashutosh"
    obj.salary = 100
    obj.department = "Android Development"
    println(obj.salary)

}