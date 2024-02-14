package example.kotlinbasic

fun main() {
    var age = readLine()
    println("You entered " + age)

    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println(a+b)
}