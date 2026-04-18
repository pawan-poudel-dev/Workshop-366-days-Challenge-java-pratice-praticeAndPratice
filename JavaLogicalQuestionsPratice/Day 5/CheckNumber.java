import java.util.Scanner;
public class CheckNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        // check if number is positive , negative  or zero
        int num = sc.nextInt();
        if(num >0){
            System.out.println("Number  is greater than zero " + num);

        }else if(num == 0){
            System.out.println("Number is  zero " + num);
        }
        else{
            System.out.println("Number is Negative " + num);
        }

    }
}
