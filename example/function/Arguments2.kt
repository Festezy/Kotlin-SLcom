package example.function

/**
 * We can provide multiple arguments to our function, separating them with commas.
 * For example, let's define a function that outputs the sum of its two arguments:
 * */

fun sum(x: Int, y: Int) {
    println(x+y)
}

fun main() {
    sum(8, 5)
}

/**
 * The arguments are passed to the function in the same order as they are declared.
 * */