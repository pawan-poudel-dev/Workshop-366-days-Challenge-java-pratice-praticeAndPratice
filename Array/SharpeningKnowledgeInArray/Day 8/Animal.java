class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog() {
        super();   // Calls Animal constructor
        System.out.println("Dog constructor");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
    }
}