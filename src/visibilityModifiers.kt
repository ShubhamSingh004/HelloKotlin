// public, private, protected, internal

//  When everyone should access the variable/function/class	public
//  When a function/variable should be private to the class	private
//  When a variable should be accessible in subclasses but not outside	protected
//  When a class or function should be available only inside the module	internal

// File: Example.kt (Assuming this is in a single module)
open class BaseClass {
    public var publicVar = "I am Public"  // Accessible everywhere
    private var privateVar = "I am Private"  // Accessible only within this class
    protected var protectedVar = "I am Protected"  // Accessible in subclasses
    internal var internalVar = "I am Internal"  // Accessible within the same module

    fun showValues() {
        println(publicVar)  // ✅ Allowed
        println(privateVar)  // ✅ Allowed (Inside the class)
        println(protectedVar)  // ✅ Allowed (Inside the class)
        println(internalVar)  // ✅ Allowed (Inside the class)
    }

    private fun privateFunction() {
        println("Private function can only be called inside this class")
    }

    internal fun internalFunction() {
        println("Internal function can be accessed within the same module")
    }
}

// Subclass demonstrating `protected` access
class DerivedClass : BaseClass() {
    fun accessProtected() {
        println(protectedVar)  // ✅ Allowed (Inside subclass)
        // println(privateVar)  // ❌ Not allowed (Private to BaseClass)
    }
}

// Separate class in the same module
class TestAccess {
    fun test() {
        val obj = BaseClass()
        println(obj.publicVar)  // ✅ Allowed (Public)
        // println(obj.privateVar)  // ❌ Not allowed (Private)
        // println(obj.protectedVar)  // ❌ Not allowed (Protected, only accessible in subclass)
        println(obj.internalVar)  // ✅ Allowed (Internal - Same module)
        obj.internalFunction()  // ✅ Allowed (Internal function - Same module)
    }
}

fun main() {
    val base = BaseClass()
    val derived = DerivedClass()
    val test = TestAccess()

    println("Accessing from Main:")
    println(base.publicVar)  // ✅ Allowed
    // println(base.privateVar)  // ❌ Not allowed
    // println(base.protectedVar)  // ❌ Not allowed
    println(base.internalVar)  // ✅ Allowed (Same module)

    derived.accessProtected()  // ✅ Allowed because it's inside the subclass
    test.test()  // ✅ Allowed
}
