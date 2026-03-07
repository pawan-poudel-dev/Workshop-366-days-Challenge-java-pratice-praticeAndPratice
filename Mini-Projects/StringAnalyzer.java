import java.util.Scanner;

public class StringAnalyzer {

    // Method to count vowels
    public static int countVowels(String text) {
        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    // Method to count consonants
    public static int countConsonants(String text) {
        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch) &&
               !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }

        return count;
    }

    // Reverse String
    public static String reverseString(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        return reverse;
    }

    // Palindrome check
    public static boolean isPalindrome(String text) {

        String reversed = reverseString(text);

        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        int characters = input.length();
        int words = input.split(" ").length;
        int vowels = countVowels(input);
        int consonants = countConsonants(input);

        System.out.println("\n--- String Analysis Result ---");

        System.out.println("Total Characters: " + characters);
        System.out.println("Total Words: " + words);
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);

        System.out.println("Reversed Sentence: " + reverseString(input));

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        sc.close();
    }
}