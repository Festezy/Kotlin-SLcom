package example.oop.inheritance

/**
 * Inheritance is an important concept in OOP.
 * It allows you to create classes based on other classes, inheriting their features.
 *
 * For example, let's say we have two types of users, Admins and Moderators. Both have name and age properties.
 * Instead of creating two classes with the same properties and duplicate code, we can create a parent class
 * called User with those properties and let the Admin and Moderator classes inherit those properties from it.
 * */
//open class UserInheritance(var name: String, var age: Int) {
//
//}
//
//class Admin(name: String, age: Int): UserInheritance(name, age){
//
//}
//
//class Moderator(name: String, age: Int): UserInheritance(name, age){
//
//}

/**
 * You use a colon to define the class to inherit from. Both classes use the User class's constructor to
 * initialize their properties.
 * Also, notice the open keyword in front of the User class. It is required to allow inheriting from it,
 * since, by default, all classes are final and do not allow inheriting from them.
 *
 * The class you inherit from is called the base class, while the classes that inherit from the base class
 * are called derived.
 * */

/**
 * The inherited classes can have their own properties and functions.
 * For example, let's add a new property country to the Moderator class:
 * */
open class UserInheritance(var name: String, var age: Int){

}

class Moderator(name: String, age: Int, var country: String): UserInheritance(name, age){

}

fun main() {
    val b = Moderator("Amy", 23, "USA")
    println(b.country)
}
/**
 * Now, the Moderator class inherits the name and age properties from its base class User, a
 * nd defines a country property on its own.
 *
 * When working with inheritance, each derived class should have an "is a" relationship with the base class.
 * In our example, Moderator is a User, Admin is a User.
 * However, you cannot have something like Student is a Color, so, in that case,
 * inheritance should not be applied.
 * */