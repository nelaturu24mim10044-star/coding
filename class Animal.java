class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow says Moo");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cow();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}



OUTPUT:
Cow says Moo
Dog says Woof
Cat says Meow


