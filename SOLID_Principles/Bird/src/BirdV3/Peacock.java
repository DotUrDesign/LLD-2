package BirdV3;

public class Peacock extends BirdV3 implements Flyable, Danceable{
    @Override
    public void makeSound() {
        System.out.println("Peacock sound");
    }

    @Override
    public void dance() {
        System.out.println("Peacock dance");
    }

    @Override
    public void fly() {
        System.out.println("fly low");
    }
}
