public class Palindrome_Number1 {
    public static void main(String[] args) {
        int num = 3456;
        int orginal_Number = num;
        int reversedNumber = 0;
        while (num > 0) {
            int digit = num % 10; // gets the last digit
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;

        }
        if (orginal_Number == reversedNumber) {
            System.out.println("Number is palindrome Number");
        } else {
            System.out.println("Number is not a palindrome Number.");
        }
    }

}
