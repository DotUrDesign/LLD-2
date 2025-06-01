package BirdV3;

public class Sparrow extends BirdV3 implements Flyable{

    @Override
    public void makeSound() {
        System.out.println("Sparrow sound");
    }

    @Override
    public void fly() {
        System.out.println("fly low");
    }
}
