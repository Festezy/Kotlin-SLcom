package practice.oop.gettersetter

/**
 * Pengatur Tombol
 *
 * Anda terus bekerja pada kelas Tombol.
 * Anda harus memiliki tinggi minimum untuk Tombol - tidak boleh memiliki nilai di bawah 50.
 * Anda memutuskan untuk membuat pengatur untuk properti tinggi sehingga jika nilai yang diberikan kurang dari 50, nilai tersebut akan ditetapkan sebagai 50.
 *
 * Buatlah pengatur yang valid untuk properti tinggi agar kode berfungsi seperti yang diharapkan.
 * */
class ButtonGetSet {
    var width = 0

    var height = 0
        // answer
        get() = field

        set(value) {
            if (value < 50){
                field = 50
            } else {
                field = value
            }
        }
}