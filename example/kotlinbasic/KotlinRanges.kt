package example.kotlinbasic

fun main() {

    for (i in 2..5) {
        println(i)
    }
    /**Note that both the starting and ending values are included in the range.*/
    for (x in 'a'..'e') {
        println(x)
    }

    /**You can check if a value is present in a range using the in operator.
    For example:
     */

//    val x = 42
//    if(x in 15..100) {
//        println("Yes")
//    }

    val x = arrayOf(8, 9, 42, 111)
    if(42 in x) {
        println("Yes")
    }

    /**To iterate a number range which does not include its end element,
     * use the until function: for (i in 1 until 5). In this case 5 is excluded.*/

    
}