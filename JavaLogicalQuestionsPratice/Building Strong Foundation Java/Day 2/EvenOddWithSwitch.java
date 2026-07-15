import java.util.Scanner;

public class EvenOddWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("Number is Even");
                break;

            case 1:
            case -1:
                System.out.println("Number is Odd");
                break;
        }
        sc.close();

