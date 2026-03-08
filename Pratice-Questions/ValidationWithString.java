import java.util.Scanner;

public class ValidationWithString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your phone number:");
        String phone = sc.nextLine();

        boolean valid = phone.matches("\\d{10}");

        String name = "Pawan poudel";
        boolean validName = name.matches("[A-Za-z ]+");

        String email = "PoudelPawan770@gmail.com";
        boolean validEmail = email.matches("[\\w]+@[\\w.]+\\.[a-z]{2,}");

        System.out.println("Phone valid: " + valid);
        System.out.println("Name valid: " + validName);
        System.out.println("Email valid: " + validEmail);

    }
}