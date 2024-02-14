package example.function

fun main() {
    /**
     * Oftentimes there is a need to perform an action with all items of an array.
     * Kotlin provides a forEach loop, which takes a function, defining the action to perform
     * with each of the array elements.
     *
     * For example:*/
    var arr = arrayOf(1, 3, 5)
    arr.forEach {
        it -> println(it * 4)
    }
//    arr.forEach {
//            item -> println(item * 4)
//    }
    /**
     * The forEach loop is called using the name of the array and a dot, which should be followed by a function.
     * In the code above, we name each element of the array item and output the value of item times 4.
     *
     * Kotlin provides an 'it' keyword for the name of the elements in forEach. This allows you to shorten
     * the code to the following:
     * arr.forEach {
     * println(it * 4)
     * }
     * */
}