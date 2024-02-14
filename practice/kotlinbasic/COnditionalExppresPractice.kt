package practice.kotlinbasic

/**
 * Dengan usia sebagai input, Anda perlu mengeluarkan kelompok usia sesuai dengan kategori berikut:
 * Anak: 0 - 11
 * Remaja: 12 - 17
 * Dewasa: 18 - 64
 * Senior: 65+
 *
 * Jika usia negatif, Anda perlu mengeluarkan "Usia tidak valid".
 *
 * Contoh Masukan:
 * 42
 *
 * Contoh Keluaran:
 * Dewasa
 * **/
fun main(args: Array<String>) {
    var age = readLine()!!.toInt()

//    if (age >= 0 && age <= 11){
//        println("Child")
//    } else if (age >= 12 && age <= 17){
//        println("Teen")
//    } else if (age >= 18 && age <= 64) {
//        println("Adult")
//    } else if (age >= 65){
//        println("Senior")
//    } else {
//        println("Invalid age")
//    }

    var result = when {
        (age >= 0 && age <= 11) -> {("Child")}
        (age >= 12 && age <= 17) ->{("Teen")}
        (age >= 18 && age <= 64) ->{("Adult")}
        (age >= 65) -> {("Senior")}
        else -> { ("Invalid age") }
    }

    println(result)
//
//    when (age){
//        (age >= 0 && age <= 11) -> {println("Child")}
//        (age >= 12 && age <= 17) ->{println("Teen")}
//        (age >= 12 && age <= 17) ->{println("Adult")}
//        (age >= 65) -> {println("Senior")}
//        else -> { println("Invalid age") }
//    }
}