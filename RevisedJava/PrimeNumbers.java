import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Check whether a number is prime
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit the loop when a divisor is found
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }

        // Part 2: Print all prime numbers between 1 and 100
        System.out.println("\nPrime numbers between 1 and 100 are:");

        for (int n = 2; n <= 100; n++) {
            boolean prime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }1
            }

            if (prime) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}