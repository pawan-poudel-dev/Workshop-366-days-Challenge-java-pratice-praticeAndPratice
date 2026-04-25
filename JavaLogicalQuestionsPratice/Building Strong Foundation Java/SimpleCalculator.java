import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
  
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));

        if (b != 0) {
            System.out.println("Divide: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Divide: Cannot divide by zero");
            System.out.println("Modulus: Cannot divide by zero");
        }

        sc.close();
    }
}