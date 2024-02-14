package practice.kotlinbasic

/**
 * Menemukan jumlah digit dari sebuah angka adalah tantangan coding yang populer.
 * Diberikan sebuah angka sebagai masukan, hitung dan keluarkan jumlah digitnya.
 *
 * Contoh Masukan:
 * 426
 *
 * Contoh Keluaran:
 * 12
 *
 * Petunjuk: Gunakan perulangan sementara untuk mengulang angka tersebut.
 * Selama setiap iterasi, tambahkan digit terakhir ke penjumlahan dengan membagi
 * angka tersebut dengan 10 dan mengambil sisanya (num % 10), lalu hapus digit
 * terakhir dari angka tersebut dengan membaginya dengan 10 (num / 10).
 * **/
fun main() {
    var num = readLine()!!.toInt()

    var sum = 0
    while(num != 0){
        var lastDigit = num % 10
        sum += lastDigit
        num/=10
    }

    println(sum)

}