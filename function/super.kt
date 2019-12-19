//how to use super keyword to call different functions from different interfaces/classes.

interface academic{

    fun printable(semester:Int,markObtain:Int,maxMark:Int){
        println("You are in $semester \nYour percentage of this semester is ${(markObtain.toDouble()/maxMark.toDouble())*100}")
    }
}

interface financial{
    fun printable(hostelFee:Boolean,messFee:Boolean,collegeFee:Boolean){
        println("You hostelFee status is $hostelFee")
        println("You messFee status is $messFee")
        println("You collegeFee status is $collegeFee")
    }
}

class student(roll : Int):academic , financial{
    var rollno : Int = roll ;

    fun printable(semester: Int,maxMark: Int,markObtain: Int,hostelFee: Boolean,messFee: Boolean,collegeFee: Boolean) {
        super<academic>.printable(semester,markObtain,maxMark)
        super<financial>.printable(hostelFee,messFee,collegeFee)
        println("Thank you very much $rollno")
    }

}

fun main(){
    var obj = student(1234567)
    obj.printable(4,1000,891,true,false,false)
}


