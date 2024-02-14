package practice.function

import example.function.sum

/**
 * Penghitung Huruf
 *
 * Anda perlu mendefinisikan fungsi, yang mengambil huruf dan teks sebagai argumen,
 * dan mengembalikan berapa kali huruf yang diberikan muncul dalam teks yang diberikan.
 *
 * Contoh Masukan:
 * e
 * mengagumkan
 *
 * Contoh Keluaran:
 * 2
 *
 * Kode yang diberikan mengambil huruf dan teks sebagai input dan meneruskannya ke fungsi letter_count().
 * Definisikan fungsi letter_count() agar kode yang diberikan bekerja seperti yang diharapkan.
 * */
fun main() {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}

fun letter_count(letter: Char, text: String): Int {
    var count = 0
    for (i in text){
        if (i == letter){
            count++
        }
    }
    return count
}

/** alternative answer*/
//fun letter_count(letter: Char, text: String): Int {
// Use the count function to count occurrences of the specified letter
//    return text.count { it == letter }
//}


