/*
Problem 2: Using continue
Title: Skip Even Numbers

Write a program that:

Uses a loop from 1 to 20

Skips even numbers

Prints only odd numbers

📌 Concept used: continue


*/
public class ContinueExample {
    public static void main(String [] args){
        for( int i = 1; i <= 20; i++){
            if(i %2 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
    
}
