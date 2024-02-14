package practice.oop.abstractclasses

/**
 * abstractions
 *
 * Anda memutuskan untuk membuat kelas Component menjadi abstrak, karena Anda tidak akan membuat objek dengan tipe tersebut.
 * Anda juga menambahkan fungsi show() ke kelas tersebut yang perlu ditimpa oleh kelas turunan.
 * Untuk sebuah Button, fungsi show() akan menghasilkan output: "Menampilkan Tombol", sedangkan untuk sebuah Gambar, fungsi tersebut harus menghasilkan: "Menampilkan Gambar".
 *
 * Terapkan fungsi show() yang diperlukan untuk menghasilkan keluaran yang diharapkan.
 * */
abstract class Component(width: Int, heigth: Int) {
    protected var widht = width
    protected var heigth = heigth
    abstract fun show()
}

class Button(width: Int, heigth: Int): Component(width, heigth){
    private var name = "Button"
    fun tap(){
        println("$name was tapped")
    }
    override fun show() {
        println("Showing a $name")
    }
}
class Image(width: Int, heigth: Int): Component(width, heigth){
    fun draw(){
        println("${widht}x${heigth}")
    }
    override fun show() {
        println("Showing an Image")
    }
}

fun main() {
    val b1 = Button(200, 50)
    b1.tap()
    b1.show()

    val img = Image(300, 500)
    img.draw()
    img.show()
}