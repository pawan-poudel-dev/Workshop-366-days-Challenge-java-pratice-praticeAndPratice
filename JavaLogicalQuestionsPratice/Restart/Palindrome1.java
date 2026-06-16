import java.util.Scanner;
public class Palindrome1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();// taking the input for the palindrome
        int orgNum =num;
        int rev = 0;// in order to formation of the reverse and check with the orginal number
        while(num!= 0){
            rev = rev *10 + num%10;
            num = num/10;// eliminates the last digit
        }
        if(orgNum == rev){
            System.out.println("The given number is palindrome Number");
        }else{
            System.out.println("The given number is not a palindrome number");
        }
        sc.close();

    }
}
