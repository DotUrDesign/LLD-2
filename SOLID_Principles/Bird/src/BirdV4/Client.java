package BirdV4;

public class Client {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.eat();
        e.fly();
        e.makeSound();

        Peacock p = new Peacock();
        p.dance();
        p.fly();
        p.eat();
        p.makeSound();
    }
}
