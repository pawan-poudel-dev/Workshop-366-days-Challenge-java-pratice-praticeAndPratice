/*
roblem 2: if–else

Title: Even or Odd
Write a program that:

Takes an integer input

Prints:

"Even" if the number is divisible by 2

"Odd" otherwise

📌 Concept used: if–else



*/
 import java.util.Scanner;
public class If_ElseExample {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number %2 == 0){
            System.out.println("The given number is even number:" +  number);
        }else{
            System.out.println("The given number is odd number.");
             
        }
        sc.close();
    }  
}
