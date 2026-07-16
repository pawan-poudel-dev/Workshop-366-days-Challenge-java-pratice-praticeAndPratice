/*
 * Demonstrates switch fall-through.
 * The break statement is intentionally removed after case 1.
 */

import java.util.Scanner;

public class WeekDaysSwitchExample {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit (0-6): ");
        int digit = sc.nextInt();

        switch (digit) {

            case 0:
                System.out.println("Sonntag");
                break; // Stops here if the input is 0

            case 1:
                // No break here on purpose.
                // Execution continues into the following cases.
                System.out.println("Montag");

            case 2:
                System.out.println("Dienstag");

            case 3:
                System.out.println("Mittwoch");

            case 4:
                System.out.println("Donnerstag");

            case 5:
                System.out.println("Freitag");

            case 6:
                System.out.println("Samstag");

            default:
                // Since there is no break after case 6,
                // execution also reaches the default case.
                System.out.println("INVALID VALUE");
        }

        sc.close();
    }
}