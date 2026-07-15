/*
Write a program that takes a student's marks (0–100) and prints their grade using an if-else-if ladder:
>=90: A+, >=80: A, >=70: B, >=60: C, >=40: D, else: Fail


*/

import java.util.*;

public class ResultDetermine {
    public static void main(String[] args) {
        // create a scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = sc.nextInt();
        if (grade >= 90){ 
            System.out.println("Congrulations!! you have got  A+");
        } else if (grade >= 80){ 
            System.out.println("You have scored  A in your results");
        } else if (grade <= 70){  
            System.out.println("You have scored B.");
        } else if (grade >= 60){  
            System.out.println("You have scored c grade!! Try hard");
        } else if (grade >= 40) {
            System.out.println("YOu have just passed the exam!! Needs more contretion towards study.");
        } else {
            System.out.println("You have failed in the Exam");
        }
    }

}
