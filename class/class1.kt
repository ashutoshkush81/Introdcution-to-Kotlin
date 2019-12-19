//This about the class declaration and some add some basic function
class person{
//    Variables
    var name : String = ""
    var age : Int = 18
    var gender : String = ""
    var salary : Double = 0.toDouble()
//    insertValue function
    fun insertValue(name:String, age:Int, gender:String, salary: Double){
    this.name = name
    this.age = age
    this.gender = gender
    this.salary = salary
    println("Your name is ${this.name}")
    println("Your age is ${this.age}")
    println("Your gender is ${this.gender}")
    println("Your salary is ${this.salary}")
    }
    fun getname():String{
        return name
    }
    fun incrementSalary(extra:Int){
        this.salary+=extra
        println("Your new salary is ${this.salary}")
    }


}

fun main(args:Array<String>){
    var obj = person()
    obj.insertValue("Ashutosh",20,"Male",342432.toDouble());
    obj.getname()
    obj.incrementSalary(100)


}
