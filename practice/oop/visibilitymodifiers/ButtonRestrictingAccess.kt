package practice.oop.visibilitymodifiers

/**
 * Seseorang memodifikasi kode Anda untuk membatasi akses publik ke properti lebar dan tinggi. Namun,
 * ada kesalahan dalam kode dan kode tersebut tidak dapat dijalankan.
 * Perbaiki kode yang diberikan, sehingga lebar dan tinggi hanya dapat diakses di kelas turunan, dan fungsi
 * kelas dapat diakses dari main.
 *
 * Ini adalah praktik umum untuk membatasi akses ke properti internal dan mengizinkan pengguna untuk
 * mendapatkan/menetapkan nilainya menggunakan fungsi kelas atau pengambil/penyetel.
 * */

open class Component(width: Int, height: Int){
    var width = width
    var height = height
}

class ButtonRestrictingAccess(width: Int, height: Int): Component(width, height) {
    private var name = "Button"
    fun tap(){
        println("$name was tapped")
    }
}

class Image(width: Int, height: Int): Component(width, height){
    fun draw(){
        println("${width.toString()}x${height.toString()}")
    }
}
fun main() {
    val b1 = ButtonRestrictingAccess(200, 50)
    b1.tap()

    val img = Image(300, 500)
    img.draw()
}