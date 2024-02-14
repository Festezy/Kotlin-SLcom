package example.kotlinbasic

fun main() {
    var sum = 0
    var i = 1

    // break statement
    while (i<=100) {
        sum += i
        i++
        if(sum > 1000) {
            break
        }
    }
    println(sum)

    // continue statement

    /**
     * Similar to break, the continue statement skips an iteration of the loop.
     *
     * Let's use the continue statement to calculate the sum of only the even numbers:
     * **/
    while (i <= 100) {
        i++
        if(i%2 != 0) {
            continue
        }
        sum += i
    }
    println(sum)

}