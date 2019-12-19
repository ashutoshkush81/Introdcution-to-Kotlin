// https://codeforces.com/contest/1266/problem/B
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toLong() } // list of Longs

fun main(){
    var n = readInt()
    var arr = readInts()
    for(i in arr){
//        print("i = $i ")
        if((i<15) or (i%14>6) or (i%14<1)){
            println("NO")
        }
        else
            println("YES")
    }
}