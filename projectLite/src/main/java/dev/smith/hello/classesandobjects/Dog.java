package dev.smith.hello.classesandobjects;


/*
Classes:
    - represent real world things
    - serve the role of software modules (collection of related methods and their necessary variables)

As real-representation:
    - each 'instance' of a class (also referred to as an Object) represents a single 'thing'
    - i.e. Two cars of the same make/model, but have different VINs, color, engines, etc.

As a software module:
    - Generally only one instance of a class is created at a time
    - i.e. TestClass - this class would have methods and varibales needed to test our application/functionality

A class is blueprint for objects
    - it outlines shared states and behaviors for instances
    - each instance can have states independently of each other

An object's methods may change the object's state, but the class itself doesn't change

An object's state is unique to itself. Each object operates its own behavior independently




 */
public class Dog {

    // Instance Variables - unique / specific to each instance of the class that we create
    String name;
    int size;
    String breed;
    boolean isFed; // we use camelCase as a naming convention

    /*
    Constructors - are used to create objects - we call this 'instantiating' the class'

    When we call/run a Class's Constructor - a new Object is created from the Class
    (an instance of the class is created in memory)

    Constructors are specials kinds of methods:
        - they have no return type
        - they MUST always have the same name as the class in which they're defined
        - every class MUST have at least one constructor (if you don't provide one, the compiler provides a default one
        implicity
        - ** N.B. if you provide a constructor, the default one is 'lost'
     */

    //No-args constructor
    public Dog() {}

    //

    // Construct overloading - we can define more than one constructor for a class so long as there are different names or types of parameters
    public Dog(String name) {
        this.name = name;
        this.isFed = false;
        /* if we use this single argument constructor, each Dog Object that we create using it, will have it's initial state
        of isFed set to false
                */
    }


    // Declaring a new Constructor that takes in 4 arguments
    public Dog(String name, int size, String breed, boolean isFed) {
        /*the 'this' keyword is used for self-reference - it refers to the object that is calling the method
            or this instance of the class*/
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.isFed = isFed;


    }

    //Methods - that are unique to the Dog Class
    public void bark() {
        System.out.println("The Dog goes bark");
        System.out.println(this.name + " goes bark bark");
    }


    @Override
    public  String toString() {
        return "Dog [name=" + this.name + ", size=" + this.size + ", breed=" + this.breed + ", isFed=" + this.isFed + "]";

        // we want the console to print: Dog [name=Joey, size=15, breed=Bernese, isFed=true]
    }

    /*
    NOTE: this class does not have a main method.
    - we don't need one - because we won't be executing this class
     */

}
