//21.	Find quotient without / operator
import java.util.Scanner;
public class Quotient {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    // Input for the dividend
      System.out.println("Enter Dividend: ");
      int dividend = sc.nextInt();
      // Input for the Divisior 
      System.out.println("Enter Divisor :");
      int divisor = sc.nextInt();

     if(divisor ==0){
        System.out.println("Division By Zero not allowed.");
     }
     else{
        int quotient =0;
        while(dividend >= divisor){
            dividend = dividend -divisor;
            quotient++;
        }
        System.out.println("Quotient is: " + quotient);
     }
     sc.close();

    }


    
}
