fun main() {
    var arrlist = listOf(1, 25, 68, 52, 21)
    var maxNum:Int
    maxNum=arrlist[0]
    for (i in arrlist) {
        if(maxNum<i)
        {
            maxNum=i
        }
    }
    println("Max number is: $maxNum")
}