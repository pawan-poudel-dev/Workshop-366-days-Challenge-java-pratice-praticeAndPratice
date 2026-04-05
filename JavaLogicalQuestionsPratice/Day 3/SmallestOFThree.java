// WPA to find the smallest number between 3 numbers
import java.util.Scanner;
public class SmallestOFThree {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first Number: ");
        int a = sc.nextInt();


        System.out.println("Enter a Second Number: ");
        int b = sc.nextInt();
        

        System.out.println("Enter a Third Number: "); 
        int c= sc.nextInt();
        if(a<=b && a<=c){
            System.out.println("A is smaller");
        }
        else if(b<=a&& b<=c){
            System.out.println("B is Smaller.");
        }
        else{
            System.out.println("C is smaller");
        }

    }
    
}
