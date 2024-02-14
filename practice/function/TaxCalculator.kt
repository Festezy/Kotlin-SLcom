package practice.function

/**
 * Kalkulator Pajak
 *
 * Anda perlu membuat aplikasi untuk menghitung harga barang setelah pajak. Tarif pajak adalah 15%.
 * Tentukan sebuah fungsi yang mengambil harga sebelum pajak sebagai argumennya, dan mengeluarkan harga setelah pajak.
 * Kode yang diberikan mengambil harga sebelum pajak dalam format Double sebagai input dan memanggil fungsi calc().
 *
 * Contoh Masukan:
 * 140.0
 *
 * Contoh Keluaran:
 * 161.0
 *
 * Penjelasan: Pajak atas 140,0 adalah 21,0, yang membuat harga setelah pajak = 140,0 + 21,0 = 161,0
 * */

fun calc(price: Double){
    val calculate = price * 0.15
    val result = price + calculate
    println(result)
}

fun main() {
    val price = readLine()!!.toDouble()
    calc(price)
}