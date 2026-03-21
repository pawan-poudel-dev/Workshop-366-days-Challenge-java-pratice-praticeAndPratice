public class StudentManagementSystem {
    private String name;
    private int roll_Number;
    private float marks;

    // Constructor
    public StudentManagementSystem(String name, int roll_Number, float marks){
        this.name = name;
        this.roll_Number = roll_Number;
        this.marks = marks;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_Number);
        System.out.println("Marks: " + marks);
    }

    boolean checkResults(){
        if(marks >= 40){
            System.out.println("Student is Passed");
            return true;
        } else {
            System.out.println("Student is Failed");
            return false;
        }
    }
}

class StudentMain {
    public static void main(String [] args){

        StudentManagementSystem s1 = new StudentManagementSystem("Pawan", 12, 90);
        StudentManagementSystem s2 = new StudentManagementSystem("Shyam", 23, 80);

        s1.displayDetails();
        boolean r1 = s1.checkResults();

        System.out.println("====================");

        s2.displayDetails();
        boolean r2 = s2.checkResults();

        System.out.println("====================");

        if(r1 && r2){
            System.out.println("Both students passed.");
        } else {
            System.out.println("At least one student failed.");
        }
    }
}