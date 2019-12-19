import java.util.*
//Array In Kotlin and their limitation.

fun main(args:Array<String>){
    //declare an emptyArray
    var a = emptyArray<Int>()
    a+=1
    a+=2
    a+=3
    //This is very costly. Every time a new element is added then it create a new array and copy the element from the
    //previous array and add new element.

    var b = arrayOfNulls<Int>(3) //It declare a new a of size 3.
    b[0]=1
    b.set(1,2)
    b.set(2,3)
    b+=3

    var c = arrayOf(1,2,3,4,5) //It just declare a new array with some initial values.
    c+=6
    var d = Array<Int>(3,{i->i+1})
    d+=5
    //There is another way to declare a array for some specific type of data structure. like intArrayOf,longArrayOf,shortArrayOf,byteArrayOf etc.

    //How to print array.
    println(a)  //This won't directly print the array we need some library function to print array like
    //1. Using Arrays.toString() helper function
    println(Arrays.toString(a))
    //2.1. Using for loop
    for(i in a){
        print("$i ")
    }
    println("")
    //2.2
    for(i in 0..a.size-1){
        print("${a[i]} ")
    }
    println("")
    //2.3
    a.forEach { i->print("$i ") }
    println("")
    //2.4
    a.forEachIndexed({index,element->println("$index -> $element")})

    println(Arrays.toString(b))
    println(Arrays.toString(c))
    println(Arrays.toString(d))

}