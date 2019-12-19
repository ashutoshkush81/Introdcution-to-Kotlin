fun main(){
//    Diff. between var and val
//    Once I assigned value to a , I can change value of a if a is var
    var a = 32
    a = 40
    println("Value of a after change : "+a)
    println("Value of a after change is ${a}")
//    I can't change the value of val b , once i assigned to it
    val b = 40
//    b = 30
    println("Original value of b : "+b)
    println("Original value of b is ${b}")

//    about Byte datatype
    var b1 : Byte = Byte.MIN_VALUE
    var b2 : Byte = Byte.MAX_VALUE
    println("Min and Max value of Byte variable is ${b1} , ${b2} respectively")
//    About Short datatype
    var s1 : Short = Short.MIN_VALUE
    var s2 :Short = Short.MAX_VALUE
    println("Min and Max value of Short variable is ${s1} , ${s2} respectively")
//    About Int  datatype
    var i1 : Int = Int.MIN_VALUE
    var i2 : Int = Int.MAX_VALUE
    println("Min and Max value of Int variable is ${i1} , ${i2} respectively")
//    About Long datatype
    var l1 : Long = Long.MIN_VALUE
    var l2 : Long = Long.MAX_VALUE
    println("Min and Max value of Long variable is ${l1} , ${l2} respectively")
//    About Float datatype
    var f = 23.32
    print("Value of f is ${f}")
    var f1 : Float = Float.MIN_VALUE
    var f2 : Float = Float.MAX_VALUE
    println("Min and Max Value of Float is ${f1} , ${f2} respectively")
//    About Double datatype
    var d1 : Double = Double.MIN_VALUE
    var d2 : Double = Double.MIN_VALUE
    println("Min and Max value of Double is ${d1} , ${d2} respectively")
//    Boolen datatype
    var bool : Boolean = true
    println(bool)

//    Char datatype
    var c : Char = 'C'
    println(c)
//    Diff. between print and Println is print does not create a  new line after the end of the print statement while in case of println after the statement
//    cursor will move to next line.

}