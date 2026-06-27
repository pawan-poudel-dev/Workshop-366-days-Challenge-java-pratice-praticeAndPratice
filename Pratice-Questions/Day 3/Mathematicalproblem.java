import java.util.*;
public class Mathematicalproblem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);// here we have taken the input from the keyword
        System.out.println("Enter your first digit :");
        int num1 =  sc.nextInt();
        System.out.println("Enter your second digit:");
        int num2 = sc.nextInt();
         int sum = num1 + num2;// sum of numbers
         int difference = num1 - num2;// substraction of the number
         int product = num1 *num2;// multtiplication of the number
         int Division = num1 /num2;// Divison of the number
         int Remainder = num1 % num2;// Remainder of the Number
        System.out.println("Sum is  :" + sum +"\nDiffference is : " + difference +"\nproduct is : "+ product +"\nDivision is :" + Division+"\nRemainder is : "+ Remainder);// final output of the code is  written here and  also you can also see in the Terminal as well 



    }
}
