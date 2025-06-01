package BirdV3;

/*
    Imp point -
    Explain why eat() is not abstract, why makeSound() is not an interface, and why other methods like fly() & dance() is an interface ?
    - eat() => all birds do eat(that is why present inside the class) and the impl will be same for every bird(that is why, it's not made abstract/interface)
    - makeSound() => all birds do makeSound(that is why present inside the class & it's not made an interface) but the impl will be different for different birds(that is why, it's made abstract. We can't have a concrete impl for every bird)
    - fly() & dance() => some birds fly and some don't (which ever birds don't fly, they don't have to implement this interface, and others can). Basically, when some methods become optional to implement, then we put it into interface.


    Merits -
    1. Code to an interface, rather than to a concrete implementation
    2. ISP principle followed ---> Things that change for a single reason, should be grouped into one interface. The interfaces should be segregated as per the requriements.
    3. No class explosion - as we are now using interfaces for the optional methods.

    Issues -
    1. DRY principle violated.
    flyLow and flyHigh implementations are still being repeated.
 */

public abstract class BirdV3{
    String type;
    void eat() {
        System.out.println("Every bird eats");
    }
    public abstract void makeSound();   // We didn't decided to make this an interface, as this method will compulsorily be implemented by every type of bird, but as every bird will have different implementation of it, so we made it "abstract.
}
