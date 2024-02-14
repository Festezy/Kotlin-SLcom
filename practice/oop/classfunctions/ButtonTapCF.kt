package practice.oop.classfunctions

/** Button Tap
 * Mari tambahkan beberapa perilaku ke kelas Button kita!
 * Anda perlu mendefinisikan fungsi tap() untuk kelas Button. Fungsi tersebut harus mengeluarkan pesan
 * "tombol telah diketuk", di mana "tombol" adalah nama objek. Ini berarti Anda juga perlu menambahkan
 * properti nama ke kelas Button.
 *
 * Kode di main mengambil nama Button sebagai input, menetapkannya ke properti, dan memanggil fungsi tap().
 *
 * Contoh Input:
 * Kirim
 *
 * Contoh Keluaran:
 * Kirim telah diketuk
 *
 * Perhatikan bahwa konstruktor harus menyertakan hanya properti lebar dan tinggi
 * */
class ButtonTapCF(var width: Int, var height: Int) {
    /** your code goes here */
    var name = ""

    fun tap(){
        if (name != ""){
            println("$name was tapped")
        } else{
            println("$name was not tapped")
        }
    }

//    fun tap(){
//        println("$name was tapped")
//    }
}

fun main() {
    val b1 = ButtonTapCF(200, 50)
    b1.name = readLine()!!

    b1.tap()
}