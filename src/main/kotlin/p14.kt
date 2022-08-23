open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Vansh","Shah",19,20012011158,"CE","C","AB8")
    var s2=Student("Amit","Gupta",20,20012011134,"CE","C","AB7")
    var s3=Student("Susheel","Pandey",21,20012011134,"IT","B","AB3")
    var s4=Student("Priya","Chaudhari",19,20012011112,"Arts","A","AB9")
    var s5=Student("Anwesha","Saha",18,20012011179,"B.Pharm","A","AB1")

}