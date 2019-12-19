// Secondary Constructor
// Secondary constructors allow initialization of variables and allow to provide some logic to the class as well.
// They are prefixed with the constructor keyword.
class Add1{
    constructor(a:Int,b:Int){
        var c = a + b;
        println("$a + $b = $c")
    }
}

class employee3 {

    constructor (emp_id : Int, emp_name: String ) {
        var id: Int = emp_id
        var name: String = emp_name
        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }

    constructor (emp_id : Int, emp_name: String ,emp_salary : Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary : Double = emp_salary
        print("Employee id is: $id, ")
        print("Employee name: $name, ")
        println("Employee name: $salary")
    }
}
class Add2 {
    // calling another secondary using this
    constructor(a: Int,b:Int) : this(a,b,7) {
        var sumOfTwo = a + b
        println("The sum of two numbers $a and $b is: $sumOfTwo")
    }
    // this executes first
    constructor(a: Int, b: Int,c: Int) {
        var sumOfThree = a + b + c
        println("The sum of three numbers $a,$b and 7 is: $sumOfThree")
    }
}

class Child : Parent{
    constructor(name:String,age:Int,salary:Int):super(name ,age)
    {
        println("Your Salary is $salary")
    }
}
//if u want to know more about open
//https://blog.mindorks.com/understanding-open-keyword-in-kotlin
open class Parent{
    constructor(name : String,age : Int)
    {
        var emp_name = name
        var emp_age = age
        println("Employee name is $emp_name")
        println("Employee age is $emp_age")
    }
}



fun main(){
    var obj = Add1(10,11)
    /*We can't assigned obj1 and obj2 with the same object because here obj1 has different size than other obj2*/
    var obj1 = employee3(10,"Ashutosh")
    var obj2 = employee3(11,"Dhruv",1000.toDouble())
    /*We can extend upto many secondary constructor we want*/

    /*Calling one secondary constructor from another – A secondary constructor may call another
    secondary constructor of the same class using this() function*/
    var obj3 = Add2(10,5)

    /*Calling parent class secondary constructor from child class secondary constructor*/
    var obj4 = Child("Ashutosh",19,100000)

}
