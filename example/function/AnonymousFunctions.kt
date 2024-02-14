package example.function

fun main() {
    /**
     * Not all functions need a name. In some cases the function does a very simple task with it's input.
     * In these cases it's simpler to define an anonymous function.
     *
     * Let's define our sum() function from the previous lessons as an anonymous function:
     */
//    val f: (Int, Int) -> Int = { a, b -> a+b }
    val f = { a:Int, b:Int -> a+b }
    /**
     * Our function needs to take two Integer inputs and return their sum. That is why the type of
     * the function is (Int, Int) -> Int. The parentheses define the input type, while the arrow
     * defines the return type.
     *
     * Inside the body of the function we have named our input arguments a and b,
     * and used the arrow to return their sum.
     *
     * Now, when we have our anonymous function defined, we can assign it a variable and
     * use it in our code, just like a normal named function:
     * */
    var result = f(8, 42)
    println(result)

    /**In the code above, we assigned the anonymous function to the variable f and used f to call it.
     *
     * The anonymous function can be shortened as: val f = { a:Int, b:Int -> a+b } because Kotlin
     * automatically understands the return type from the arguments.
     * */
}