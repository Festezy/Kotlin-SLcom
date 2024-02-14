package example.function

/**
 * A function can take another function as an argument. These functions are called higher-order functions.
 * This is useful when we want to change the behavior of a function.
 *
 * For example:
 * */
fun apply(x: Int, action: (Int) -> Int): Int {
    return action(x)
}

/**
 * apply is a higher-order function which takes an integer and a function named action as its arguments.
 * Then it calls the action function on its integer argument and returns the result.
 *
 * Now we can call our apply function and pass it different anonymous functions as the action argument:
 * */
fun main() {
    println(apply(4, { x -> x * 2 }))
    println(apply(4) { x -> x / 2 })
    println(apply(6) {it /2})

    /**
     * As you can see, our anonymous functions don't need to define the type of its argument,
     * because Kotlin automatically guesses it.
     * */

    /**
     * Kotlin has many higher-order functions.
     * For example, the filter() function of an array takes a Boolean function and returns the elements that match the given condition.
     *
     * For example, let's filter only the elements that are greater than 5:
     * */
    val arr = arrayOf(42, 3, 10, 4, 6, 1)
    val res = arr.filter { it > 5 }
    println(res)
    /**This will result in only the elements that are greater than 5.*/
}