class Student1 {
    String name;
    int age;

    // constructors
    Student1(String n, int a) {
        name = n;
        age = a;

    }

    void display() {
        System.out.println(name + "is" + age + "Years old.");
    }

}

public class Students {
    public static void main(String[] args) {
        Student1 s1 = new Student1("pawan", 19);
        Student1 s2 = new Student1("Alice", 20);
        s1.display();
        s2.display();

    }
}