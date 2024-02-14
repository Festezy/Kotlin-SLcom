package example.oop.constructors

/**
 * Constructors allow you to initialize properties when objects are created.
 * The constructor is defined using parentheses after the class name and includes the properties we want:
 *
 * For example:
 * */
//class UserCons(val name: String, val age:Int) {
//
//}
/**
 * Now, when creating a User object, we need to pass it values for the name and age properties:
 * */

/**
 * Kotlin allows you to create multiple constructors using the constructor keyword:
 * */
class User (){
    var name  = ""
    var age = 0

    constructor(nm: String) : this() {
        name = nm
    }

    constructor(nm: String, a:Int) : this() {
        name = nm
        age = a
    }
}
/**
 * Now, our User class has two constructors.
 *
 * As you can see, constructors are like functions, taking arguments.
 * */
