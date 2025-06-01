package BirdV2;

import BirdV1.BirdV1;

public class Client {
    public static void main(String[] args) {
        BirdV2 b1 = new Eagle();
        b1.eat();
        b1.makeSound();

        FlyingBird b2 = new Eagle();
        b2.fly();

        Eagle e = new Eagle();
        e.eat();
        e.fly();
        e.makeSound();

        Penguin p = new Penguin();
        p.eat();
        p.makeSound();
        // p.fly();  --> throws error, as Penguine class implements NonFLyingBird interface
    }
}
