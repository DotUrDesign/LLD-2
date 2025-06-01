package BirdV2;

import BirdV1.BirdV1;

public class Peacock extends FlyingBird{

    @Override
    public void fly() {
        System.out.println("fly low");
    }

    @Override
    public void makeSound() {
        System.out.println("Peacock sound");
    }

    public void dance() {
        System.out.println("Peacock dance");
    }
}
