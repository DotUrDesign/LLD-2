package BirdV4;

public class Eagle extends BirdV4 implements Flyable {

    Flyable fh = new FlyHigh();
    @Override
    public void makeSound() {
        System.out.println("Eagle sound");
    }

    @Override
    public void fly() {
        fh.fly();
    }
}
