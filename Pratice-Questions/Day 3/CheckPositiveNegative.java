import java.util.Scanner;
public class CheckPositiveNegative {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int a = sc.nextInt();
        if(a <0){
            System.out.println("Negative Number.");

        }else if( a== 0){
            System.out.println("Given Number is Zero.");
        }else
            System.out.println("Positive Number");
sc.close();
    }
}
