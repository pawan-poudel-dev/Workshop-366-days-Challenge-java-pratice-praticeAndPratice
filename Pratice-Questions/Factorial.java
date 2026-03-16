/*calculating the factorial of a number  */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        int i;
        for(i = 1; i <= num;i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + num + "is:" + factorial);

        
    sc.close();

        
    }
    
}
