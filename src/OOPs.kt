import javax.print.Doc

class Lamb(var brand: String){  // primary constructor
    private var isOn: Boolean
    private var b: String

    init{
        isOn = true
        b = brand.uppercase()

        print("Value of B is $b \n")
    }


    fun turnOn(){
        isOn = true
        println("Lamb turned on")
    }

    fun turnOff(){
        isOn = false
        println("Lamb Turned Off")
    }

    fun displayisOn(){
        println("isOn: $isOn")
    }

    fun displayBrand(){
        println("The Brand is: " + this.brand)
    }
}


open class Person{
    private var firstName: String
    private lateinit var lastName: String
    constructor(fName: String){
        firstName = fName
    }

    constructor(fName: String, lName: String ){
        firstName = fName
        lastName = lName
    }


    fun getFName(): String {
        return this.firstName
    }

    fun getLName(): String{
        return  this.lastName
    }
}

class Doctor(private var fName: String, private var lName: String): Person(fName, lName) {
    fun operate(){
        println("Doctor $fName is operating")
    }
}

fun main(){
    val l1 = Lamb("Havells")  // Priamary constructor

    l1.turnOn()
    l1.displayisOn()
    l1.turnOff()
    l1.displayisOn()
    l1.displayBrand()
    l1.brand = "Orient"
    l1.displayBrand()


//     Person - Secondary Constructor
//    val p = Person()  --> Not allowed

    println("\n\n\nPERSON OBJECTS")
    val p = Person("Adi")
    val p2 = Person("Rahul", "Sharma")

    println(p.getFName())
    println(p2.getFName())
    println(p2.getLName())

    val d = Doctor("Shub", "Singh")
    d.getFName()
    d.getLName()
    d.operate()

}