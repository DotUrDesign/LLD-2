package BirdV3;

public class Eagle extends BirdV3 implements Flyable{

    @Override
    public void makeSound() {
        System.out.println("Eagle sound");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
