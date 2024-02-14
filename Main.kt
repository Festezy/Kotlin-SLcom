class Num(value:Int) {
    var v = value+2
        set(value) {
            field = value+v
        }
}
fun main(args: Array<String>) {
    val x = Num(3)
    x.v = 7
    println(x.v)
}