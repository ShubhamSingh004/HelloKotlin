fun main() {
    // Mutable variable (var) of type String
    var a: String = "hi"
    a = "Hello"  // Allowed, since 'var' allows reassignment

    // Immutable variable (val) of type Int
    val marks: Int = 34  // 'val' cannot be reassigned

    // String interpolation: embedding variables inside a string
    println(a + " Shubham, you have scored $marks")

    // Function call (currently commented out)
    // test("Hello, I am Test")
}

// Function that takes a String as an argument and prints it
fun test(str: String) {
    println(str)
}
