package BirdV0;

/*
    Issues
    1. Multiple if-else blocks ---> OCP principle violated
    2. fly() and makeSound() method in one class(code unit) ---> SRP principle violated.
        If I have to modify the fly() method, I have to come to BirdV0 class, and if I have to modify the makeSound() method, I have to come to BirdV0 class.
        Meaning I have more than one reason to change this class, which violates the SRP principle.
    3. The implementation is tightly coupled. Meaning no use of interfaces. And the rule is Code to an interface(logical impl), not to an concrete impl.
 */

public class BirdV0 {
    String type;
    public BirdV0(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println("Every bird eats");
    }
    void fly() {
        if(type.equals("peacock")) {
            System.out.println("Fly method of peacock");
        } else if(type.equals("Eagle")) {
            System.out.println("Fly method of Eagle");
        }
    }

    void makeSound() {
        if(type.equals("peacock")) {
            System.out.println("Sound of peacock");
        } else if(type.equals("Eagle")) {
            System.out.println("sound of eagle");
        }
    }
}
