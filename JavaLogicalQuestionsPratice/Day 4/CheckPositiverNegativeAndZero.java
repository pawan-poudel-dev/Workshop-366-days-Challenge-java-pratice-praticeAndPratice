// WPA to check wether the number is positive negative and zero
// taking input from the keyword 
import java.util.Scanner;
class CheckPositveNegativeAndZero{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Positive Number");
        }
        else if(number < 0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Given Number is  Equals to Zeero");
        }
sc.close();      

    }
}