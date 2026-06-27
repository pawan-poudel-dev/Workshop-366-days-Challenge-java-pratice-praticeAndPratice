// Minimum of three numbers
import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("The minimum number is: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("The minimum number is: " + b);
        } else {
            System.out.println("The minimum number is: " + c);
        }

        sc.close();
    }
}