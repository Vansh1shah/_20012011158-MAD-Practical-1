fun main()
{
    var car1=Car("BMW","10",9000000,"Vansh Shah",8000000)
    println("${car1.getCarInformation()}")
    println("${car1.getCurrentCarPrice()}")
    println("${car1.getOriginalCarPrice()}")
    println("${car1.displayCarInfo()}")
}
class Car constructor(type:String, model:String, price:Long, owner:String, originalPrice:Long)
{
    var type:String=type
    var model:String=model
    var price:Long=price
    var owner:String=owner
    var originalPrice:Long=originalPrice
    fun getCarInformation():String
    {
        return type
    }
    fun getOriginalCarPrice():Long{
        return originalPrice
    }
    fun getCurrentCarPrice():Long{
        return price
    }
    fun displayCarInfo():String{
        return "$type\n$model\n$price\n$owner\n$originalPrice"
    }
}