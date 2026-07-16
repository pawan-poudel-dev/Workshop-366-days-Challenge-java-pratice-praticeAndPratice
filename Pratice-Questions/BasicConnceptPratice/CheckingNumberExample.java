import java.util.Scanner;

public class CheckingNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if (num > 1 && num < 100) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Number is divisible By both  3 & 5");
            } else {
                System.out.println("Number is Not Divisible by Both");
            }
        } else {
            System.out.println("Number is Not between 1 and 100");
        }
        sc.close();
    }

}
