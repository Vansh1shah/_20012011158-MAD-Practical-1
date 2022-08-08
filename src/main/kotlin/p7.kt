tailrec fun fact(a:Int):Long{
    if(a<=1)
    {
        return 1
    }
    else
    {
        return fact(a-1)*a
    }
}

fun main()
{
    println(fact(8))
}