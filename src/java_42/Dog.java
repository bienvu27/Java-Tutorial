package java_42;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Xuong");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau Gau");
    }
}
