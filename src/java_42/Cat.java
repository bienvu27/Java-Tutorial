package java_42;

public class Cat extends Animal{
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("Hat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
