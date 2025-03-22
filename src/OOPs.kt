// Class representing a Lamb (Lamp with a typo)
class Lamb(var brand: String) {  // Primary constructor - 'brand' becomes a property of the class
    private var isOn: Boolean  // Private property to track lamp status (on/off)
    private var b: String  // Private property to store the uppercase version of the brand name

    // Initialization block executed when an object is created
    init {
        isOn = true  // Default state of the lamp is ON
        b = brand.uppercase()  // Convert brand name to uppercase

        print("Value of B is $b \n")  // Print the uppercase brand name
    }

    // Method to turn the lamp on
    fun turnOn() {
        isOn = true
        println("Lamb turned on")
    }

    // Method to turn the lamp off
    fun turnOff() {
        isOn = false
        println("Lamb turned off")
    }

    // Method to display whether the lamp is on or off
    fun displayisOn() {
        println("isOn: $isOn")
    }

    // Method to display the brand of the lamp
    fun displayBrand() {
        println("The Brand is: " + this.brand)
    }
}

// Base class representing a generic person
open class Person {
    private var firstName: String  // Private property to store the first name

    // 'lateinit' allows the variable to be initialized later
    private lateinit var lastName: String

    // Secondary constructor with only first name
    constructor(fName: String) {
        firstName = fName
    }

    // Secondary constructor with first and last name
    constructor(fName: String, lName: String) {
        firstName = fName
        lastName = lName
    }

    // Method to retrieve first name
    fun getFName(): String {
        return this.firstName
    }

    // Method to retrieve last name (will throw an error if lastName is not initialized)
    fun getLName(): String {
        return this.lastName
    }
}

// Derived class 'Doctor' extending 'Person'
class Doctor(private var fName: String, private var lName: String) : Person(fName, lName) {

    // Method to simulate doctor performing an operation
    fun operate() {
        println("Doctor $fName is operating")
    }
}

fun main() {
    // Creating an instance of Lamb using the primary constructor
    val l1 = Lamb("Havells")

    // Demonstrating method calls on the 'Lamb' object
    l1.turnOn()
    l1.displayisOn()
    l1.turnOff()
    l1.displayisOn()
    l1.displayBrand()

    // Modifying the brand name
    l1.brand = "Orient"
    l1.displayBrand()


    // Creating Person objects using secondary constructors
    println("\n\n\nPERSON OBJECTS")
    val p = Person("Adi")  // Only first name
    val p2 = Person("Rahul", "Sharma")  // First and last name

    // Displaying names
    println(p.getFName())
    println(p2.getFName())
    println(p2.getLName())

    // Creating a Doctor object and invoking its methods
    val d = Doctor("Shub", "Singh")
    d.getFName()  // Inherited method
    d.getLName()  // Inherited method
    d.operate()  // Doctor-specific method
}
