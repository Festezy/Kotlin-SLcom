package practice.oop.constructor

/**
 *Konstruktor Tombol
 *
 * Anda perlu memodifikasi kelas Button dan menambahkan konstruktor default ke dalamnya, yang menginisialisasi properti lebar dan tinggi.
 * Tambahkan konstruktor agar kode yang diberikan di main berfungsi seperti yang diharapkan.
 *
 * Kode yang diberikan mengambil nilai dari input pengguna dan meneruskannya ke konstruktor objek.
 * */
fun main() {
    val b1 = ButtonsConstructor(readLine()!!.toInt(), readLine()!!.toInt())

    println(b1.width*b1.height)
}