/*
Write a Java program to print all numbers from 1 to 10 except multiples of 3 using a for loop and continue.



*/
public class ContinueExample {
    public static void main(String [] args){
     int i;
     for(i = 1; i<= 10; i++){
        if(i %3 ==0){
            continue;// skips the rest of the iteration which is divisible by 3 
        }
        System.out.print(i+" ");
     }
    }
    
}
