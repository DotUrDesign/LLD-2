package BirdV4;

public class Sparrow extends BirdV4 implements Flyable {

    Flyable fl = new FlyLow();
    @Override
    public void makeSound() {
        System.out.println("Sparrow sound");
    }

    @Override
    public void fly() {
        fl.fly();
    }
}
