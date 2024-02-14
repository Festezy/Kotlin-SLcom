package practice.function


/**
 * Kalkulator Pengiriman
 *
 * Anda sedang mengerjakan situs web eCommerce dan perlu membuat kalkulator biaya pengiriman berdasarkan jumlah pesanan.
 * Toko tersebut menggunakan struktur biaya berikut:
 * Untuk pesanan di AS:
 * - Pesanan senilai $75+ memiliki pengiriman gratis
 * - pesanan kurang dari $ 75 memiliki biaya pengiriman 10% dari total jumlah pesanan.
 *
 * Untuk pesanan internasional, ada biaya pengiriman 15%, dengan maksimum $ 50. Ini berarti biaya pengiriman maksimum untuk pesanan internasional adalah $50.
 *
 * Anda harus menyelesaikan fungsi shippingCost() yang diberikan, yang mengambil jumlah pesanan dan sebuah Boolean yang menunjukkan apakah pesanan tersebut internasional atau tidak, dan mengembalikan biaya pengiriman untuk pesanan tersebut.
 * Jumlah pengembalian harus berupa Double.
 *
 * Contoh Masukan:
 * 140.0
 * benar
 *
 * Contoh Keluaran:
 * 21.0
 *
 * Pesanan tersebut seharga $140 dan bersifat internasional. Jadi, biaya pengirimannya adalah 15%, yaitu $21.*/
fun shippingCost(amount: Double, international: Boolean): Double {
    /**answer*/
    var fee = if (international) 0.15 else 0.1
    fee *= amount
    val result = when (international) {
        true -> {
            if (fee > 50) 50.0 else fee
        }
        false -> {
            if (amount < 75.0) fee else 0.0
        }
    }
    return result
}

fun main() {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()
    println(shippingCost(total, international))
}