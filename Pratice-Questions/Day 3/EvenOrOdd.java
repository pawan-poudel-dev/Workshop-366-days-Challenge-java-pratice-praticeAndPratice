import java.util.*;
public class EvenOrOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");// Now we are going to check all of that weather they are even or odd number
        int num = sc.nextInt();
        if(num%2 ==0){
            System.out.println("Given Number is Even Number.");
        }else{
            System.out.println("Given Number is Odd Number.");
        }
    }
}
