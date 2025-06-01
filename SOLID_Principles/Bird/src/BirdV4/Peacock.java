package BirdV4;

public class Peacock extends BirdV4 implements Flyable, Danceable {
    Flyable fl = new FlyLow();
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
        fl.fly();
    }
}
