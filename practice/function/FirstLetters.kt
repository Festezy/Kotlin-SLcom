package practice.function

fun main() {
    /**
     * Anda diberikan kode yang harus mengulang sebuah array dan menampilkan huruf pertama dari setiap elemen.
     * Namun, kode tersebut memiliki kesalahan.
     * Perbaiki kode tersebut untuk menghasilkan keluaran yang diharapkan.
     *
     * Huruf pertama harus digabungkan pada baris yang sama tanpa jeda baris.
     * */
    /**
     * soal
     *     var arr = arrayOf("James", "Amy", "Sam", "Olie", "Bob")
     *     val res = ""
     *     arr.forEach() {
     *         str -> res += item-1
     *     }
     *     println(res)
     * */

    var arr = arrayOf("James", "Amy", "Sam", "Olie", "Bob")
    var res = ""
    arr.forEach() {
            str -> res += str[0]
    }
    println(res)
}