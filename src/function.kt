fun main(){
    // function overloading
    println(sum(1, 3))
    println(sum(1, 2 ,3))
    println(sum(1.0f, 2.00009f))
}

fun sum(a: Int, b: Int) = a + b
fun sum(a: Int, b: Int, c: Int) = a + b + c
fun sum(a: Float, b :Float) = a + b