package BirdV1;

import BirdV0.BirdV0;

public class Client {
    public static void main(String[] args) {
        BirdV1 b1 = new Eagle();
        b1.fly();
        b1.makeSound();
        b1.eat();

        BirdV1 b2 = new Peacock();
        b2.fly();
        b2.makeSound();
        b2.eat();
    }
}
