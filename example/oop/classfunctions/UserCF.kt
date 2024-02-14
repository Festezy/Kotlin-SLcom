package example.oop.classfunctions

/**
 * A class can have functions, which define behavior.
 *
 * For example:
 * */
class UserCF(var name: String, var age: Int) {
    /** session one */
//    fun login(){
//        println("Login from user $name" )
//    }
    /** session two */
    fun isAdult():Boolean {
        if (age >= 18){
            return true
        } else {
            return false
        }
    }
    /** Just like a function, you can also pass arguments to your class functions. */
}
fun main() {
    /** session one */
//    var u = UserCF("James", 42)
//    u.login()
}
/**
 * Functions can be called using the dot syntax.
 *
 *
 * */
