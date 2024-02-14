package practice.kotlinbasic

fun main() {


    /**
     * Parking Fee
     *
     * Anda sedang membuat perangkat lunak parkir mobil yang perlu menghitung dan
     * mengeluarkan jumlah yang harus dibayar berdasarkan jumlah jam mobil diparkir.
     * Biaya dihitung berdasarkan struktur harga berikut:
     * - 5 jam pertama ditagih dengan harga $1 per jam.
     * - setelah itu, setiap jam ditagih dengan harga $0,5 per jam.
     * - untuk setiap 24 jam, ada biaya tetap sebesar $15.
     *
     * Ini berarti, misalnya, jika sebuah mobil diparkir selama 26 jam,
     * tagihannya adalah 15 + (2 * 0,5) = 16,0, karena mobil tersebut diparkir selama 24 jam ditambah 2 jam tambahan.
     *
     * Contoh Masukan:
     * 8
     *
     * Contoh Keluaran:
     * 6.5
     *
     * Penjelasan: 5 jam pertama ditagih dengan harga $1/jam, yang menghasilkan $5. Setelah itu,
     * 3 jam berikutnya ditagih dengan harga $0,5/jam = $1,5.
     * Jadi, totalnya adalah $5 + $1,5 = $6,5
     * */

    var hours = readLine()!!.toInt()
    var total: Double = 0.0

    if (hours in 1..5) {
        total = hours * 1.0
    } else if (hours in 6..23) {
        total = 5 + ((hours - 5) * 0.5)
    } else {
        total = ((hours / 24) * 15) + ((hours % 24) * 0.5)
    }

    println(total)

    /** alternate answer*/
//    when (hours){
//        in 1..5 -> total = hours * 1.0
//        in 6..23 -> total = 5 + (hours - 5)*0.5
//        else -> total = ((hours/24) * 15) + (hours % 24) * 0.5
//    }
//
//    println(total)



}