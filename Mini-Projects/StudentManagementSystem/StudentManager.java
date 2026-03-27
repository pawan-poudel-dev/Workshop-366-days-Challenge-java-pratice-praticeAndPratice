import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student newStudent) {

        //  Duplicate ID check
        for (Student s : students) {
            if (s.getId() == newStudent.getId()) {
                System.out.println(" ID already exists!");
                return;
            }
        }

        students.add(newStudent);
        System.out.println(" Student added successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            s.display();
        }
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println(" Student Found:");
                s.display();
                return;
            }
        }
        System.out.println(" Student not found.");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println(" Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}