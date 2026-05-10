abstract class Animal {

    // abstract method
    abstract void sound();

    // normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstraction {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.sleep();
    }
}