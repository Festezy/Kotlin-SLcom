package example.oop.classes

/**
 * Pemrograman Berorientasi Objek (OOP) memungkinkan kita untuk membuat objek dan menggunakannya dalam program kita.
 * Objek dapat menyimpan data dan memiliki fungsi untuk memodelkan perilaku.
 * Sebagai contoh, program Anda dapat memiliki objek User, yang digunakan untuk menyimpan data pengguna dan melakukan tindakan, seperti login/logout, dll.
 *
 * Untuk membuat objek, pertama-tama kita harus mendefinisikan sebuah kelas.
 * Sebuah kelas adalah seperti sebuah cetak biru - kelas mendefinisikan detail rumah yang akan kita bangun.
 *
 * Setelah mendefinisikan kelas, kita dapat membuat beberapa objek dari kelas tersebut, sama seperti kita dapat membuat beberapa rumah dengan menggunakan cetak biru yang sama.
 * */
fun main() {
    /**
     * When we have our class defined, we can create objects of that class:
     * */
    val u1 = User()
    u1.name = "James"
    u1.age = 42

    /**
     * The properties can be accessed using a dot after the object's name.
     *
     * In the code above, u1 is an object of the type User.
     * */
}