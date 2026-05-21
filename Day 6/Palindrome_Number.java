public class Palindrome_Number {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reversedNum = 0;

        // Logic to reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (original == reversedNum) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
