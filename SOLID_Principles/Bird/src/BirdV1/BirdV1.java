package BirdV1;

/*
    Merits -
    1. Now, every type of bird can extend this class and have their own implementation. Tomorrow, if any new bird comes, no need to change the Bird class, the new bird class can extend the BirdV1 class and have their own implementation.
    2. SRP principle followed ---> now, the class BirdV1 has only one reason to change i.e., eat() method which is common for all classes which will extend it.
    3. OCP principle followed

    Issues -
    1. Any new bird comes, for example Penguin, which have no implementation of fly(), but have implementation for makeSound(). Then how it's going to extend the BirdV1 class ? ---> exception/error or empty inside fly() method ---> Liskov's substitution principle violated, which says if the child class cannot implement all the methods of the parent class, then it shouldn't extend it.
    2. A class can only extend one class, meaning it has restriction over using "extends". So it's better to use interfaces, as a class can implement multiple interfaces(don't have any restriction over using "implements")
 */

public abstract class BirdV1 {
    String type;
    void eat() {
        System.out.println("Every bird eats");
    }

    public abstract void fly();
    public abstract void makeSound();
}
