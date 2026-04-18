import java.util.Scanner;
public class PerfectlyDivisible {
    public static void main(String [] args){
        // checking  if number is perfectly divisible by both 3 and 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num %3 == 0&& num%5 == 0){
            System.out.println("Number is divisible by 3 and 5 both");

        }else{
            System.out.println("Number is not divisible by 3 and 5 ");
        }
        sc.close();
    }
}
