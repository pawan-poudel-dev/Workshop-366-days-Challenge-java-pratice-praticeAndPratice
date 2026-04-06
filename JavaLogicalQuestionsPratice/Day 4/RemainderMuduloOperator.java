import java.util.Scanner;

public class RemainderModuloOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed!");
        } else {
            int quotient = dividend / divisor;
            int remainder = dividend - (divisor * quotient);

            System.out.println("Remainder: " + remainder);
        }

        sc.close();
    }
}