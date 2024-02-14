package example.oop.gettersetter

/**
 * Until now we have accessed properties directly.
 * If you would like to customize how a property is accessed, you can provide a custom getter and setter for that property.
 * A getter defines how the value is accessed, while a setter defines how a new value is set.
 *
 * Here is the default syntax:
 * */
class UserGetSet {
//    var name = ""
//
//    var age = 0
//        get()= field
//
//        set(value) {
//            field = value
//        }

    /**
     * The get() function defines how the value of the age property is accessed:
     * it simply returns the current value using the field keyword.
     *
     * The set() function sets the provided value using the value keyword.
     *
     * In the code above we have not modified the setter and getter logic yet, they just get and set the provided value.
     *
     * Now we can modify the getter and setter behavior.
     *
     * For example:
     * */

    var name = ""

    var age = 0
        get() = field - 1

        set(value) {
            if (value < 0){
                field = 18
            } else {
                field = value
            }
        }

    /**
     * In the code above, we have defined the getter to return the value of age minus 1.
     * The setter is defined to set the value 18, in case the provided value is negative.
     *
     * Getters and Setters provide an easy way to customize the logic of getting and setting a property value.
     * */
}