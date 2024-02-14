package example.kotlinbasic

fun main() {
    var i = 1

    while(i <= 5){
        println("Hello $i" ) // baru ini
        i++ // ini pertama dulu yg jalan
    }

    var sum = 0
    while (i<=100) {
        sum += i
        i++
    }
    println(sum)

    // During each iteration, the sum variable adds the value of i,
    // which is then incremented by one.

}