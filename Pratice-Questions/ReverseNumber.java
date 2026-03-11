public class ReverseNumber {
    public static void main(String[] args) {
        int originalNumber = 12345;
        int reversedNumber = 0;
        int remainder;

        while (originalNumber != 0) {
            // Get the last digit
            remainder = originalNumber % 10;

            // Build the reversed number
            reversedNumber = reversedNumber * 10 + remainder;

            // Remove the last digit from the original number
            originalNumber /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber); // Output: 54321
    }
}
