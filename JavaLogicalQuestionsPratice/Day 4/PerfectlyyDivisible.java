//WPA to check if  a number is perfectly divisible by both 3 and 5 
import java.util.Scanner;
public class PerfectlyyDivisible {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(a %3 == 0 &&a %5==0){
            System.out.println("Perfectly Divisible by  Both 3 and 5");

        }
        else if( a %3 ==0){
            System.out.println("Number is perfectly Divisible by 3");
        }
        else if(a %5 == 0){
            System.out.println(" Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by  3 and 5");
        }
        sc.close();
    }
    
}
