
/*

Write a program that takes a number and prints "Even" or "Odd" using an if-else statement.
*/
import java.util.*;
import java.util.Scanner;

class EvenOddExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is Even Number");
        } else {
            System.out.println("Number is odd Number");
        }

    }
}
