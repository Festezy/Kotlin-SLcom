package practice.oop.classes

/**
 * Button
 *
 * Anda sedang membuat antarmuka pengguna yang perlu memiliki tombol di dalam formulir.
 * Anda memutuskan untuk membuat kelas Button, dengan properti lebar dan tinggi.
 * Lengkapi program yang diberikan sehingga kode di main berfungsi seperti yang diharapkan.
 *
 * Lebar dan tinggi adalah bilangan bulat.
 * */
fun main() {
    val b1 = ButtonClas()
    b1.width = readLine()!!.toInt()
    b1.height = readLine()!!.toInt()

    println(b1.width+b1.height)
}