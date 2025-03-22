// Function to check if a number is positive, negative, or zero using if-else
fun ifElse(a: Int) {
    if (a == 0) println("Number is 0")
    else if (a < 0) println("Number is negative")
    else println("Number is positive")
}

// Function to demonstrate the use of 'when' as a replacement for switch-case
fun whenKeyWord(a: Int) {
    when (a) {
        0 -> println("Number is zero")
        1 -> println("Number is 1")
        else -> println("Number is neither 1 nor 0")  // Default case (similar to 'default' in switch)
    }
}

// Function to demonstrate the 'while' loop
fun whileLoopExample(str: String, a: Int) {
    var i = 0
    while (i <= a) {
        println("$i $str")  // Prints index with the provided string
        i++
    }
}

// Function to demonstrate the 'do-while' loop (runs at least once)
fun doWhileLoopExample(a: Int) {
    var i = 0
    do {
        println("$i - Executing do-while loop")
        i++
    } while (i <= a)
}

// Function to demonstrate a 'for' loop
fun forLoop(a: Int) {
    for (i in 1..a) {
        println(i)  // Prints numbers from 1 to 'a'
    }

    for(eachLetter in "Shubham"){
        println(eachLetter)
    }
}

fun main() {
    // Reading user input as an integer
    print("Enter the value of a: ")
    val a: Int = readln().toInt()

    // Calling functions
    ifElse(a)
    whenKeyWord(a)

    println("\nWhile Loop Execution:")
    whileLoopExample("Hello", a)

    println("\nDo-While Loop Execution:")
    doWhileLoopExample(a)

    println("\nFor Loop Execution:")
    forLoop(a)
}
