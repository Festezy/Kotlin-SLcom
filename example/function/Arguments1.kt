package example.function


/**
 * Arguments provide input to our functions.
 *
 * For example, let's say we want to pass a name as input to our welcome() function,
 * so that the output included the provided name:
 * */

fun welcome(name: String) {
    println("Hello, " + name)
}

/**Our function now takes one argument of type String called name and we can refer to
 * that argument using its name inside the function's body.
 *
 * When calling this function, you must include an argument within the parentheses:
 * */

fun main() {
    welcome("James")
    welcome("Amy")
}

/**Now, the name argument will have the provided value when the function is called. */