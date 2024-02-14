package example.kotlinbasic

fun main() {
    val num = -7
    val result1 = if (num > 0) "Positive" else "Negative"
    println(result1)

    val result2 = when {
        num > 0 -> "Positive"
        num < 0 -> "Negative"
        else -> "Zero"
    }
    println(result2)
}