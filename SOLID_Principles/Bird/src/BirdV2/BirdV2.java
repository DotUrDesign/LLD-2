package BirdV2;

/*
    Merits -
    1. SRP handled
    2. OCP handled
    3. LSP handled

    Issues -
    1. Suppose tomorrow, a new categorisation comes like birds which can swim and which can't swim, then we have to make 4 classes - fly+swim, fly+not_swim, not _fly+swim, not_fly+not_swim
    for 2 categories ---> 4 classes
    for n categories ---> 2 to the power n classes
    which can lead to class explosion  ---> If we rely on interfaces, we can solve this problem.

    2. Going out of the box, we can see we are repeating the implementation of the flyLow and flyHigh for birds
    Eagle - flyHigh implementation
    Peacock, sparrow - flyLow implementation
    Meaning we are breaking the DRY(Do not Repeat Yourself) principle

    3. Again dependent on concrete implementations(i.e., abstract classes) rather than interfaces.
 */

public abstract class BirdV2 {
    String type;
    void eat() {
        System.out.println("Every bird eats");
    }
    public abstract void makeSound();
}
