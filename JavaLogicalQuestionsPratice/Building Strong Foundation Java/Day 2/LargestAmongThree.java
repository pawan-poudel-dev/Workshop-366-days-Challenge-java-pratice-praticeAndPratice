import java.util.Scanner; // Import Scanner class for user input

public class LargestAmongThree {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        // Ask the user to enter the second number
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        // Ask the user to enter the third number
        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();

        // Check if the first number is greater than or equal to
        // both the second and third numbers
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        }

        // Otherwise, check if the second number is greater than or
        // equal to both the first and third numbers
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        }

        // If neither the first nor the second is the largest,
        // then the third number must be the largest
        else {
            System.out.println(num3 + " is the largest number.");
        }

        // Close the Scanner to free system resources
        sc.close();
    }
}