/*
Problem 1: Using break
Title: Stop at First Multiple of 7

Write a program that:

Uses a loop from 1 to 50

Prints each number

Stops the loop immediately when it finds the first number divisible by 7

Prints "Loop stopped at <number>"

📌 Concept used: break
*/
public class ExampleBreakStatement {
public static void main(String [] args){
    
    for(int i = 1; i <= 50; i++){
        if(i % 7 == 0){
            break;
        }
System.out.println(i);
        
    }
}
    
}
