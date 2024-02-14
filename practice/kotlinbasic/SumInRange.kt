package practice.kotlinbasic


fun main() {
    /**
     * You need to make an app that calculates the sum of all numbers in a given range.
     * Take two numbers as input, defining the start and end of the range. Then, calculate the sum of all numbers in that range and output the result.
     *
     * Sample Input:
     * 5
     * 9
     *
     * Sample Output:
     * 35
     * */

    val input1= readLine()!!.toInt()
    val input2= readLine()!!.toInt()

    var sum= 0
    for (i in input1..input2){

        sum += i
//        if (sum == input2){
//            break
//        }
    }
    println(sum)
}