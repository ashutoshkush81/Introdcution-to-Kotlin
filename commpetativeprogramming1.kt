import java.lang.Integer.max

fun main(){
    var n : Int
    n = readLine()!!.toInt()
    var arr = readLine()!!.split(" ")
    var newarr = Array<Int>(n,{0})
    for(i in 0..n-1){
        newarr[i]=arr[i].toInt()
    }
    var ans : Int = 1
    var forward = Array<Int>(n,{1})
    var backward = Array<Int>(n,{1})
    for(i in 1..n-1){
        if(newarr[i]>newarr[i-1]){
            forward[i]=1+forward[i-1]
            ans = max(ans,forward[i])
        }
    }
    for(i in n-2 downTo 0){
        if(newarr[i+1]>newarr[i]){
            backward[i]=1+backward[i+1]
        }
    }

    for(i in 1..n-2){
        if(newarr[i-1]<newarr[i+1]){
            ans = max(ans,forward[i-1]+backward[i+1])

        }
    }
    println(ans)

}