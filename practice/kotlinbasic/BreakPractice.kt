package practice.kotlinbasic

fun main() {

    /**
     * Masukan Terus Menerus
     *
     * Kode yang diberikan menggunakan perulangan perulangan tak terbatas untuk mengambil masukan pengguna secara terus menerus.
     * Pada setiap iterasi, sebuah angka diambil dari input.
     * Anda perlu memperbaiki program untuk menghentikan perulangan saat pengguna memasukkan angka 0 dan mengeluarkan jumlah input yang diambil sebelumnya.
     *
     * Contoh Input:
     * 42
     * 1
     * 66
     * 0
     *
     * Sample Output:
     * 3
     * **/


    var counter = 0 // answer
    while(true) {
        var input = readLine()!!.toInt()

        // answer
        if (input == 0){
            println(counter)
            break
        }
        counter++
        // answer
    }

}