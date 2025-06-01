package BirdV0;

public class Client {
    public static void main(String[] args) {
        BirdV0 b = new BirdV0("Eagle");
        b.fly();
        b.makeSound();

        BirdV0 b2 = new BirdV0("peacock");
        b2.fly();
        b2.makeSound();
    }
}
