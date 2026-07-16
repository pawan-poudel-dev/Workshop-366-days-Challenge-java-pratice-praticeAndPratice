import java.util.Scanner;

public class ForLoopExample1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        for (int i = 1; i <= 10; i++) {
            String name = sc.nextLine();
            System.out.println(name);
        }
        sc.close();
    }
}