package BirdV2;

public class Eagle extends FlyingBird{

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void makeSound() {
        System.out.println("eagle sound");
    }

}
