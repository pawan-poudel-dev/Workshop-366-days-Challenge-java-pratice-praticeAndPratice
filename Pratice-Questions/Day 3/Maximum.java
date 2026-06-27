import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = sc.nextInt();

        System.out.print("Enter second number: ");
        int num1 = sc.nextInt();

        if (num > num1) {
            System.out.println(num + " is greater than " + num1);
        } else if (num < num1) {
            System.out.println(num + " is less than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}