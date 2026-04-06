// Find absolute value without Math Library
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num= sc.nextInt();
    
    if(num <0){
        num = -num;
    }
    System.out.println("Abs Value is: " + num);
   sc.close(); 
    

    }
    
}
