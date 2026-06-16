// Palindrome Number  taking the input of the Number
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit Number: ");
        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;// here build the reverse order
            // Fix: Use num % 10 to extract the last digit of the remaining number
            num = num / 10;// elimintes the last digit
        }
        if (org_num == rev) {
            System.out.println(org_num + " Given number  is palindrome number ");
        } else {
            System.out.println(org_num + " Given number  is  not palindrome number ");
        }
        sc.close();
    }
}