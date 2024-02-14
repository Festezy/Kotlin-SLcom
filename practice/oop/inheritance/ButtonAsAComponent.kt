package practice.oop.inheritance

/**
 *
 * Kelas Button Anda terlihat cukup bagus!
 * Namun, Anda juga perlu memiliki gambar pada form.
 * Karena gambar memiliki properti lebar dan tinggi yang sama, Anda memutuskan untuk membuat kelas dasar
 * bernama Component dan mewarisi kelas Button dan Image darinya.
 * Kelas Button harus memiliki properti nama dan fungsi tap(), sedangkan kelas Image harus memiliki fungsi draw(),
 * yang menghasilkan tinggi dan lebar dalam format: widthxheight. Jadi untuk gambar dengan lebar 100 dan tinggi 150,
 * output yang dihasilkan adalah 100x150.
 *
 * Lengkapi kode yang diberikan untuk mendefinisikan kelas Image dan mewarisi kelas Button dan Image
 * dari kelas Component.
 *
 * Perhatikan, bahwa lebar dan tinggi adalah bilangan bulat, jadi untuk menggabungkannya menjadi string
 * Anda perlu mengonversinya menggunakan fungsi toString(): width.toString()
 * */

open class Component(var width: Int, var height:Int){

}

class ButtonAsAComponent(width: Int, height: Int): Component(width, height) {
    var name = "Button"
    fun tap(){
        println("$name was tapped")
    }
}

class Image(width: Int, height: Int): Component(width, height){
    val widthString = width.toString()
    val heightString = height.toString()
    fun draw(){
        println("${widthString}x${heightString}")
    }
}

fun main() {
    val b1 = ButtonAsAComponent(200, 5)
    b1.tap()

    val img = Image(300, 500)
    img.draw()
}