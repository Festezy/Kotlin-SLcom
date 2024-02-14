package practice.oop.musicplayer

/**
 * MusicPlayer
 *
 * Anda sedang membuat aplikasi Pemutar Musik.
 * Anda perlu mengimplementasikan kelas MusicPlayer, yang seharusnya menyimpan nama-nama lagu sebagai String
 * dalam sebuah array. Larik sudah didefinisikan dalam kode yang diberikan.
 *
 * Pemutar harus mendukung fungsi-fungsi berikut:
 * add: menambahkan trek argumen yang diberikan ke larik trek.
 * show: menampilkan semua nama trek di pemutar pada baris terpisah.
 * play: mulai memainkan track pertama dengan mengeluarkan "Playing name" di mana name adalah nama track pertama.
 *
 * Anda dapat menambahkan item baru ke larik dengan menggunakan +=, misalnya: tracks += track
 *
 * Kode di main mengambil nama track dari input pengguna dan memanggil fungsi pemutar. Jangan memodifikasi kode
 * di main.
 * */
class MusicPlayer {
    private var songs: Array<String> = arrayOf()
    // your code here
    fun add(input: String) {
        if (input != "stop") {
            songs += input
        }
    }
    fun show() {
        for (i in songs) {
            println(i)
        }
    }
    fun play() {
        println("Playing ${songs[0]}")
    }
}

fun main() {
    val m = MusicPlayer()
    while (true) {
        var input = readLine()!!
        if (input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}
}