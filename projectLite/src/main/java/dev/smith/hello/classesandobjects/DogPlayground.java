package dev.smith.hello.classesandobjects;

public class DogPlayground {

    public static void main(String[] args) {

        // Use the Dog constructor to create a dog object
        // This will reserve the space in memory needed to store all information about our dog object

        // Datatype + Reference Variable  = new keyword + Constructor;
        Dog myDog = new Dog();

        myDog.name = "Fido";
        myDog.size = 2;
        myDog.breed = "Terrier";
        myDog.isFed = false;


        Dog d2 = new Dog("Lucky", 10, "Golden Retriever", true);

        /* System.out.println("myDogs's name is " + myDog.name);
        System.out.println("d2's name is " + d2.name); */

        Dog d3 = new Dog("Happy");
        System.out.println("d3's isFed = " + d3.isFed);

        myDog.bark();
        d2.bark();
        d3.bark();

        System.out.println(myDog);
        System.out.println(d2);
        System.out.println(d3);

    }
}
