fun arithmetic(vararg nums:String)
{
    var ans=0
    var mul=1
    when(nums[nums.size-1])
    {
        "+"->for(i in 0..nums.size-2)
        {
            ans=ans+nums[i].toInt()
        }
        "-"->for(i in 0..nums.size-2)
        {
            ans=ans-nums[i].toInt()
        }
        "+"->for(i in 0..nums.size-2)
        {
            mul=mul*nums[i].toInt()
        }
        "/"->for(i in 0..nums.size-2)
        {
            mul=mul/nums[i].toInt()
        }
    }
    println(ans)
    println(mul)
}

fun main()
{
    arithmetic("1","2","3","*")
}