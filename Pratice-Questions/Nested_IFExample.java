/*
Title: Greatest of Three Numbers
Write a program that:

Takes three integers a, b, and c

Finds and prints the largest number

Use nested if statements only

📌 Concept used: nested if
*/
import java.util.Scanner;
public class Nested_IFExample {
    public static void main(String [] arrgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a: ");
        int a  = sc.nextInt();
        System.out.println("Enter a number b : ");
        int b = sc.nextInt();
        System.out.println("Enter a number c: ");
        int c = sc.nextInt();
        if(a >= b){
            if(a >= c){
                System.out.println("The largest number isc : " + a);
            }else{
                System.out.println("the largest number is : " + c);;
            }
        }else{
            if(b > c){
                System.out.println("The greatest numbber is: " + b);
            }else{
                System.out.println("The greatest numbeer is :" + c);
            }
        }
        sc.close();
    }}