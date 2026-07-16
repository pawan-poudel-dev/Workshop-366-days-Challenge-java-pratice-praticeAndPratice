import java.util.*; // Imports all utility classes, including Scanner

class ExampleSwitch {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a digit :");

        // Read the integer entered by the user
        int num = sc.nextInt();

        // Find the remainder when the number is divided by 2
        // 0 = even, 1 or -1 = odd
        switch (num % 2) {

            // If remainder is 0, the number is even
            case 0:
                System.out.println("Number is Even");
                break;

            // If remainder is 1, the number is odd (positive)
            case 1:

                // If remainder is -1, the number is odd (negative)
            case -1:
                System.out.println("Number is an odd number");
                break;

            // This case will rarely execute for integer input,
            // but is included as a fallback.
            default:
                System.out.println("Invalid Output");
        }

        // Close the Scanner to free system resources
        sc.close();
    }
}