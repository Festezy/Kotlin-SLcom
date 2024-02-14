package practice.function

/**
 * Filtering Names
 *
 * Anda diberikan sebuah array nama dan hanya perlu menampilkan nama-nama yang dimulai dengan huruf yang diberikan.
 * Huruf tersebut harus diambil dari masukan pengguna.
 * Setiap nama yang dihasilkan harus dikeluarkan pada baris terpisah.
 *
 * Kode yang diberikan mengambil huruf sebagai masukan.
 * */
fun main() {
    var letter = readLine()!![0]
    val names =
        arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")

//    answer
    val result = names.filter { it.contains(letter) }
//    println(result)

    for (i in result){
        println(i)
    }

}