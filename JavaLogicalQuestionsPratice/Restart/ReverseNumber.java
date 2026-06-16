 import java.util.Scanner;
public class ReverseNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit :");
        int num = sc.nextInt();

        int  rev = 0;
        while(num !=0){
            rev = rev *10 + num%10;// Here creating the reverse order of the number
            num = num/10;// eliminates the last digit
        }
System.out.println(rev);
    }
}
