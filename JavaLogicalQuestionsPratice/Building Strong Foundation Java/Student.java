import java.util.ArrayList;
import java.util.Scanner;

// Custom Exception
class StudentAlreadyExistsException extends Exception {
    public StudentAlreadyExistsException(String message) {
        super(message);
    }
}

// Student class (OOP concept)
class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name.toLowerCase(); // string handling
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

// Main system class
class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    // Add student with exception handling
    public void addStudent(Student s) throws StudentAlreadyExistsException {
        for (Student st : students) {
            if (st.getId() == s.getId()) {
                throw new StudentAlreadyExistsException("Student with ID " + s.getId() + " already exists!");
            }
        }
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    // Search student by name
    public void searchStudent(String name) {
        name = name.toLowerCase(); // string handling
        boolean found = false;

        for (Student s : students) {
            if (s.getName().contains(name)) {
                s.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with name: " + name);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter ID: ");
                            int id = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = Integer.parseInt(sc.nextLine());

                            if (age < 5 || age > 100) {
                                throw new IllegalArgumentException("Age must be between 5 and 100.");
                            }

                            sms.addStudent(new Student(id, name, age));

                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number input!");
                        }
                        break;

                    case 2:
                        sms.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter name to search: ");
                        String nameSearch = sc.nextLine();
                        sms.searchStudent(nameSearch);
                        break;

                    case 4:
                        System.out.println("Exiting program...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}