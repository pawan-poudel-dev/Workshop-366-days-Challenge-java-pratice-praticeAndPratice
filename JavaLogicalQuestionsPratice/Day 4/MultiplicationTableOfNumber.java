//WPA to print the multiplication table of the given Number 
import java.util.Scanner;
public class MultiplicationTableOfNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

// use the main logic to calculate the multiplication table 
for(int i = 1;i<=10;i++){
    System.out.println(num + " x "+i+" = "+ (num *i));
}
        
sc.close();
    }
    
}
