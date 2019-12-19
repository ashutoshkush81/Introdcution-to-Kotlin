//Inheritance of class
//1.Inheritance through primary constructor
open class parent61(name : String,age:Int){
    var empName : String
    var empAge :Int
    init {
        empName = name
        empAge = age
        println("Employee name is $empName")
        println("Employee age is $empAge")
    }
}

class child61(name:String,age:Int,salary:Int):parent61(name,age){
    var empSalary : Int
    init {
        empSalary =salary
        println("Employee salary is $empSalary")
    }
}

//2.Inheritance through Secondary Constructor(Recommendation :Not to be use instead of primary constructor)
open class parent62{
    constructor(name:String,age:Int){
        println("Employee name is $name \n Employee age is $age")
    }
}

class child62 : parent62{
    constructor(name:String,age:Int,salary:Int):super(name,age){
        println("Employee salary is $salary")
    }
}

//3.Kotlin program of overriding the member property and member function –
//We can also call the base class member functions or properties from the derived class using the super keyword.
open class animal{
    open var about = "Dog"
    open var speed = "40Kmph"
    open fun summary(){
        println("The animal is $about")
        println("The speed of animal is $speed")
    }
}

class tiger:animal(){
    override  var about = "Tiger"
    override  var speed = "100kmph"
    override fun summary() {
        super.summary() //using super keyword we can access the member function and property
    }
}


fun main(){
    var obj = child61("Ashutosh",19,10000)
    var obj1 = child62("Dhruv",20,100000)
    var obj2 = animal()
    obj2.summary()
    var obj3 = tiger()
    obj3.summary()


}
