package example.oop.visibilitymodifiers

/**
 * Kotlin provides visibility modifiers to restrict access to properties and methods.
 * Here are the common modifiers:
 * public: visible everywhere
 * protected: visible to the subclasses only
 * private: not visible from the outside
 *
 * By default, all properties and methods are public, meaning you can access them using the dot syntax
 * from anywhere in the code.
 * Let's say we want to restrict access to the age property of our User class:
 * */
class UserVM(var name: String, private var age: Int) {
    /**section 2
     * Now, when our age is private, we can define functions to access and modify its value:
     * */
    fun getAge(): Int{
        if (age < 18){
            return 18
        } else {
            return age
        }
    }
    fun setAge(a: Int){
        if (a < 0){
            age = 18
        } else {
            age = a
        }
    }

    /**
     * This allows us to get and set the value in a controlled way.
     * For example, we could skip the set function, making the property read-only.
     * Another popular example is a Bank Account: you would not want the balance of an account to be publicly accessible. So, you would set it as private and use special functions to get and modify its value (withdraw, deposit, etc.).
     *
     * Visibility modifiers can also be applied to class functions, as well as getters and setters.
     * */
}

fun main() {
    val u1 = UserVM("Amy", 23)
//    println(u1.age) //error
    
}
/**
 * The code will cause an error, as age is not visible from the outside of the class.
 *
 * This allows to secure the property from direct modifications.
 * */