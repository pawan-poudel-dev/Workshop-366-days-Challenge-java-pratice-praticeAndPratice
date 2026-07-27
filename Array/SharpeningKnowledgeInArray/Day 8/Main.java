// Class
class Student {
    // Attributes (fields)
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating an object of Student class
        Student s1 = new Student();

        // Assigning values
        s1.name = "Ajay";
        s1.age = 20;

        // Calling method
        s1.display();
    }
}