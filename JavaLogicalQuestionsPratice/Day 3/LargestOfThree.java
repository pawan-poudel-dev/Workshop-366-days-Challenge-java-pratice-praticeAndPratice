// WPA to calculate the largest of  three numbers
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a= sc.nextInt();
        System.out.println("Enter a Second Digit: ");
        int b = sc.nextInt();
        System.out.println("Enter a third digit: ");
        int c = sc.nextInt();
    
        if(a>=b &&a>=c){
            System.out.println("A is  greater than B and C.");
        }
        else if(b>=a&& b>=c){
            System.out.println("B is greater than A and C");
        }
        else{
            System.out.println("C is greater than A and B");
        }
    }
    
}
