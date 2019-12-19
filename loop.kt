import java.util.Scanner
fun main() {
//    In Kotlin, if is an expression, i.e. it returns a value.
//    Finding the maximum of three number
    println("Enter three interger in new line : ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    var max: Int
    max = if (a > b) {
        if (a > c) {
            println("largest number is : ")
            a
        } else {
            print("Largest number is : ")
            c
        }
    } else {
        if (b > c) {
            print("largest number is : ")
            b
        } else {
            print("Largest number is : ")
            c
        }
    }
    println(max)

//    While loop in Kotlin
    var upto: Int = 1
    while (upto <= 10) {
        print("$upto ")
        upto++
    }
    println()

//    do - while in Kotlin
//    Factorial of number
    print("Enter the number to find the factorial : ")
    var reader = Scanner(System.`in`)
    var num2: Int
    num2 = reader.nextInt()
    var ans: Int = 1
    do {
        ans *= (num2)
        num2--;
    } while (num2 > 0)
    if (ans == 0) {
        ans = 1;
    }
    println("Final answer is " + ans)

//    for loop in Kotlin
//    1.Using range operator ..
    for (i in 0..10)
        print("$i ")
    println("")
    for (i in 10..0)
        print("$i ")
    println("")
    for (i in 1..10 step 2)
        print("$i ")
    println("")
    for (element in 5 downTo 1)
        print("$element ")
    println("")
    for (element in 5 downTo 1 step 3)
        print("$element ")
    println("")
//    for(element in 10..1 step -1)
//        print("$element ")
//    println("")
//    Above statement does not work because step can't be negative , use have to use only downTo statment in for loop to traverse in the array
    var arr = arrayOf(1, 2, 4, 5, 6)
    for (i in arr)
        print("$i ")
    println("")
    var name: String = "Geeksforgeeks"
    var name1: String = "AshutoshKushwaha"
    for (element in name)
        print("$element ")

    for (element in name1)
        print("$element ")

    println("")

//    When Statement in Kotlin
//    1.->when can be use as statement or expression
    print("Enter number : ")
    var num = reader.nextInt()
    when (num % 2) {
        0 -> println("$num is even")
        1 -> println("$num is odd")

    }
    var output: String = String()
    output = when (num % 2) {
        0 -> "even"
        1 -> "odd"
        else -> "not a number"
    }
    println("$num is $output")
//    Note->In case of 1 when case we don't need to keep the else statement but in case of assingnment statement we need the else statement .
    /*That is case of first statement we dont't need to assignment / print the values but in case of assignment we must need to assign some value to string/statement*/
    print("Enter the month number of year: ")
    var num1 = reader.nextInt()
    when (num1) {
        in 1..3 -> println("It is spring season")
        in 4..6 -> println("It is summer season")
        in 7..8 -> println("It is rainy season")
        in 9..10 -> println("It is autumn season")
        in 11..12 -> println("It is winter season")
        !in 1..12 -> println("Enter valid month of year")
    }

//    Break can use in two way 1.unlabeled break 2.labeled break
//    unlabeled break use like other programming lang.
//    2.labeled break
    num1 = 4
    outer@ while (num1 > 0) {
        var num2 = 3
        inner@ while (num2 > 0) {
            println("num1 = $num1 , num2 = $num2")
            if (num2 == 2)
                break@inner
            num2--;
        }
        num1--;
        if (num1 == 1)
            break@outer;
    }
}
