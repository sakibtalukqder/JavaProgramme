// Animal.java
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Dog.java
public class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    public void fetch() {
        System.out.println("Dog fetches a ball.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound.

        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks.
        dog.fetch(); // Output: Dog fetches a ball.
    }
}
