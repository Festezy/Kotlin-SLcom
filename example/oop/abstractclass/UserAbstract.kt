package example.oop.abstractclass

import example.oop.inheritance.UserInheritance

/**
 * In some cases the base class is only needed for its derived classes and you will not create any
 * objects of the base class type.
 * For example, let's say all of our users are Moderators or Admins. In that case, we will never need
 * to create an object of type User.
 * In these situations we can define the base class as abstract:
 * */

abstract class UserAbstract(var name: String, var age: Int) {
    /** section 2
     * Abstract classes can also contain abstract functions - functions without any definition that the derived
     * classes need to implement.
     * Let's say our Moderator and Admin classes need to have a display function, each with its own implementation.
     * In that case, we can create an abstract function display in the base User class, which the derived classes
     * need to implement using the override keyword:
     * */
    abstract fun display()
}
class Admin(name: String, age: Int): UserAbstract(name, age){
    /**section 2*/
    override fun display(){
        println("$name is $age years old")
    }
}
class Moderator(name: String, age: Int, var country: String): UserAbstract(name, age){
    /**section 2*/
    override fun display() {
        println("$name is from $country")
    }
    /**
     * section 2
     * Now, each of the classes has its own implementation of the display function.
     * All abstract functions must be implemented in the derived classes.
     *
     * We have learned about the key concepts of OOP. With a combination of properties and functions, you can create classes that model all types of objects.
     * */
}
/**
 * Now, we cannot create any User objects. Instead, we need to use Admin or Moderator types.
 *
 * Abstract classes are always open, so you do not need to use the open keyword.
 * */