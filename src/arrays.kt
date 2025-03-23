fun main() {
    // Creating an array with mixed data types (String and Int)
    var a = arrayOf("hello", "world", 1, 2, 3)
    println(a)  // Prints the reference of the array, not its contents

    // Creating an array of type Long explicitly
    var b = arrayOf<Long>(1, 2, 3, 4)

    // Modifying an element in the array
    a[0] = "Hi" // Equivalent to a.set(0, "Hi")

    // Iterating through the array using a for-each loop
    for (ele in a)
        println(ele)  // Prints each element in the array

    // Accessing elements using get() and indexing
    println(a.get(2))  // Retrieves the element at index 2
    println("Value of array at pos 2 is " + a[2])
    // Do not use String Interpolation $a[2] directly inside a string, as it gives an object reference

    // a[5] = ... -> Error (IndexOutOfBoundsException if attempted)
    // Arrays have a fixed size; adding elements dynamically is not possible

    // Printing the array elements again after modification
    for (ele in a)
        println(ele)


    val arrayList = arrayListOf(1, 2, 3)  // Mutable list
    arrayList.add(4)  // Adds element to the list
    arrayList.add(5)


    val oldArray = arrayOf(1, 2, 3)
    val newArray = oldArray.copyOf(oldArray.size + 2) // Increase size by 2
    newArray[3] = 4  // Adding new elements manually
    newArray[4] = 5

    println(newArray.contentToString())  // Output: [1, 2, 3, 4, 5]
}