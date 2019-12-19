//Interfaces in Kotlin

interface Vehicle{
    fun stop();
    fun start();
}

class Car:Vehicle{
    override fun start() {
        println("Car is started")
    }
    override fun stop(){
        println("Car is stop")
    }
}

interface Dimensions{
    var length : Int
    var breadth : Int
}

interface calculateParameters : Dimensions{
    fun area():Int
    fun perimeter():Int
}

class rectangle(len : Int,bre : Int) : calculateParameters{
    override var  length = len
    override var breadth = bre
    override fun area() : Int{
        return length * breadth
    }

    override fun perimeter(): Int {
        return 2*(length + breadth)
    }
}


fun main(){
    var obj = Car()
    obj.start()
    obj.stop()
    var obj1 = rectangle(10,15)
    println("Area of obj1 = ${obj1.area()}")
    println("Perimeter of obj1 = ${obj1.perimeter()}")
}
