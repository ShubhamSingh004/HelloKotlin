// Engineer class inherits from Person
class Engineer(private var fName: String, private var lName: String) : Person(fName, lName) {

    // Property 'age' with a custom setter that ensures age is not negative or zero
    var age: Int = 0
        set(value) {
            if (value > 0) field = value  // 'field' is the backing field of 'age'
            else println("Age cannot be zero or negative")
        }

    // Read-only computed property 'agePlus3' (age + 3)
    var agePlus3: Int = 0
        get() = age + 3  // Getter returns the value of 'age' plus 3
}

fun main() {
    // Creating an instance of Engineer
    val e = Engineer("Shub", "Singh")

    // Calling inherited methods from Person class
    e.getFName()
    e.getLName()

    // Setting a valid age
    e.age = 25

    // Printing the computed property agePlus3
    println(e.agePlus3)  // Output: 28 (25 + 3)

    // Attempting to set an invalid age
    e.age = -5  // Output: "Age cannot be zero or negative"
}