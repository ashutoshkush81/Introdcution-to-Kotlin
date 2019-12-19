fun main(){
    var a : Int
    var b : Int
    println("Enter two interger two find the gcd : ")
    var values = readLine()!!.split(" ")
//    println(values)
    var flag = true ;
    a = values[0].toInt()
    b = values[1].toInt()
    print ("Gcd of given number $a  and $b is : ");
    while(flag){
        var c = b ;
        b = a%b ;
        a = c ;
        if(b==0){
            flag = false;
        }
    }
    println(a)

//    This will not work because we can't do assignment operation in while loop(In loop).
//    println("Enter two interger two find the gcd : ")
//    values = readLine()!!.split(" ")
////    println(values)
//    flag = true ;
//    a = values[0].toInt()
//    b = values[1].toInt()
//    print ("Gcd of given number $a  and $b is : ");
//    var rem = a;
//    while ((rem = a % b) != 0) {
//        a = b
//        b = rem
//    }
//    println(b)
}