class Engineer(private var fName: String, private var lName: String): Person(fName, lName){
    var age: Int = 0
        set(value){
            if(value > 0) field = value
            else println("Age cannot be zero or negative")
        }
}

fun main(){
    val e = Engineer("Shub", "Singh")
    e.getFName()
    e.getLName()
    e.age = 25



}