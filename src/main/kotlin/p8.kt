fun main()
{
    var arr1 = arrayOf(1,2,3,4,5)
    //joinToString
    println(arr1.joinToString())

    var arr2 = arrayOf<String>("V","S")
    //contentDeepToString
    println(arr2.contentDeepToString())

    var arr3 = Array(8){i:Int->i}

    for(i in 0 until arr3.size)
    {
        for(j in i+1 until arr3.size)
        {
            if(arr3[i]<arr3[j])
            {
                arr3[j]=arr3[j]+arr3[i]
                arr3[i]=arr3[j]-arr3[i]
                arr3[j]=arr3[j]-arr3[i]
            }
        }
    }
    println(arr3.joinToString())

    var arr4 = IntArray(3)
    //until
    for(i in 0 until arr4.size)
    {
        print("a[$i]: ")
        arr4[i]= readLine()!!.toInt()
    }

    var arr5 = intArrayOf(25,90,10,35)
    println(arr5.joinToString())
    //Sort
    arr5.sort()
    println(arr5.joinToString())

    var arr6 = arrayOf(intArrayOf(1,2), intArrayOf(3,4,3))
    for(i in 0 until arr6.size)
    {
        for(j in 0 until arr6[i].size)
        {
            print(arr6[i][j])
        }
        println()
    }

    //Range
    val num = 10
    if (num in 5..10) {
        println("in range")
    }
    if(num !in 5 .. 9)
    {
        println("not in range")
    }

    //step
    for (x in 1..10 step 2) {
        print("$x ")
    }
    println()

    //downTo
    for (x in 9 downTo 0 step 3) {
        print("$x ")
    }
    println()
}