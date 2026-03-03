//calculating the power of a number 
// input n = 5 
// power p = 2
// 5 *5 = 25
import java.util.Scanner;
public class Power_Of_Number {
    public static void main(String [] args){
        int n,p;
        int result = 1;
        System.out.println("Enter a number u want : ");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();//enters the base value  
         System.out.println("Enter a power of a number: ");
         p = sc.nextInt();// enters the power of a number 
         for(int i = 1; i <= p; i++){
            result *= n;




         }
         System.out.println(result);








    }
    
}
