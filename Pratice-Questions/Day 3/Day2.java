import java.util.Scanner;
public class Day2 {
    public static void main(String [] args){
        // here we will revise the old concept wee need to learn  and master to become a professional  as a java developer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =sc.nextLine();//  java  is a obj oriented so it required  its own data type , and its a keyed typed programming language
        System.out.println();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println();
        System.out.println("Enter your gender: ");
        char gender= sc.next().charAt(0);
        System.out.println("Enter your height :");
        double height = sc.nextDouble();
        System.out.println("Your name is :" + name +"\n Your age is : "+ age +"\nYour gander : " + gender +"\nYour height: "+ height);




    }
}
