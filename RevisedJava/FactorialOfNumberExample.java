import java.util.Scanner;

class FactorialOfNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        // reads the input value from the scannner
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Error: Factorial is not defined for the  negative numbers.");
        } else {
            long factorial = 1;// used long to handle lagger values

            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println(factorial);

        }
        sc.close();
    }
}