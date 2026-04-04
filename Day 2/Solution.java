import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Int Number:"  );
        int i = scan.nextInt();
        System.out.println("Enter a double number: ");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter a String sentence:");
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}