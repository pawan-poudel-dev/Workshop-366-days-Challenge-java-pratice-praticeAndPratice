//Check if someone is eligible for driving license based on age.
import java.util.Scanner;
class DrivingLicense{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if(age >=18){
            System.out.println("You are elligible to driving.");

        }else{
            System.out.println("you are not elligible to drive. Turn 18 first.");
        }
        
    }}

