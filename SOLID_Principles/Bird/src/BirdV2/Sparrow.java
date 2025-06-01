package BirdV2;

import BirdV3.BirdV3;

public class Sparrow extends FlyingBird{

    @Override
    public void makeSound() {
        System.out.println("Sparrow sound");
    }

    @Override
    public void fly() {
        System.out.println("fly low");
    }
}
