//Use of data classes.
//Data classes contains only data members.
//Data classes don't contains implementation of any function
//Data classes comes with inbuild function like .toString(),.equal(),.hashCode() etc.
class Employee(name : String){}
data class Employee11(var name : String){}//Every variable in data class should be initiated with var and val.

fun main(){
    var obj = Employee("Sudhar")
    var obj1 = Employee("Sudhar")
    if(obj1==obj){
        println("Both object is equal")
    }
    else
        println("Both Object is different")

    var obj2 = Employee11("Sudhar")
    var obj3 = Employee11("Sudhar")
    if(obj2==obj3){
        println("Both object is equal")
    }
    else
        println("Both Object is different")

}
