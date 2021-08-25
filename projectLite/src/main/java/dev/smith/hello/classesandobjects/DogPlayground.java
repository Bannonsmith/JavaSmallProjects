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

        myDog.bark();
    }
}
