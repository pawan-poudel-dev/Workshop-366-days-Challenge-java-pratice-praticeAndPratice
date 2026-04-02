/*
Design a registration workflow that validates student ID, age, email, and duplicate
registration before confirming the enrollment.
Rules to preserve
Reject invalid IDs and malformed email addresses
Enforce a minimum age rule
Stop duplicate registration attempts clearly
*/

public class StudentRegestrationValidation{
    void validate(String studentId,  int age, String email,boolean duplicate){
        try{
            if(studentId == null|| studentId.isEmpty()){
                throw new IllegalArgumentException("Invalid student Id");
            }
            if(age < 18){
                throw new IllegalArgumentException("Age must be at least 18");
            }
            if(!email.contains("@") || !email.contains(".")){
                throw new IllegalArgumentException("Invalid email address");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Validation error: " + e.getMessage());
        }
        if(duplicate){
            System.out.println("Duplicate registration attempt detected. Enrollment stopped.");
        }
        else{
            System.out.println("Enrollment confirmed for student ID: " + studentId);
        }
        

    }
}
class Main{
    public static void main(String[] args){
        StudentRegestrationValidation validator = new StudentRegestrationValidation();
        // Test cases
        validator.validate("12345", 20, "Animesh.banjara@example.com", false);
        validator.validate("12345", 20, "Dipesh.gautam@example.com", true);
        validator.validate("", 20, "Arjun.prasad11@example.com", false);
        validator.validate("145", 17, "Sushil.paudel@example.com", false);
        validator.validate("12345", 20, "invalid-email", false);
    }
}
