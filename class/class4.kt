//Kotlin constructor
//1.Primary Constructor (Maximum one allowed).
//2.Secondary Constructor(Any number of constructor allowed).
//1.Primary Constructor in class4
//2.Secondary constructor in class5
class Add constructor(a:Int,b:Int){ // constructor keyword is optional
    val c= a+b;
}

class Sub(a:Int,b:Int){
    val c = a-b;
}

class employee(name:String,company: String,salary:Int){
    var nameofemployee:String
    var companyname:String
    var salaryofemployee:Int
//    User defined constructor using init
    init {
        nameofemployee = name
        companyname = company
        salaryofemployee = salary
        println("Your name is $nameofemployee")
        println("Your company name is $companyname")
        println("Your salary is $salaryofemployee")
    }
}

class employee1(name:String,company: String="Visa",salary: Int=100000){
    var nameofemployee:String
    var companyname:String
    var salaryofemployee:Int
    //    User defined constructor using init
    init {
        nameofemployee = name
        companyname = company
        salaryofemployee = salary
        println("Your name is $nameofemployee")
        println("Your company name is $companyname")
        println("Your salary is $salaryofemployee")
    }
}



fun main(args: Array<String>){
    var obj = Add(5,6)
    println(obj.c)
    var obj1 = Sub(a = 10, b = 5)
    println(obj1.c)
    /*We can't reassigned to other class of any object*/
    /*  Primary Constructor with Initializer Block */
    var obj2 = employee("Ashutosh","Samsung",1000000)
    /*Default value in primary constructor */
    var obj3 = employee1("Abhishek","Amazon")
    var obj4 = employee1("Dhruv")

}