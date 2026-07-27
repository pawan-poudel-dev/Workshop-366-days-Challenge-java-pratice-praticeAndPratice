class Person {

    String name = "John";

    void show() {
        System.out.println("I am a Person.");
    }
}

class Student extends Person {

    String name = "Alice";

    void display() {

        System.out.println("Child Name : " + name);

        System.out.println("Parent Name: " + super.name);

        super.show();
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}