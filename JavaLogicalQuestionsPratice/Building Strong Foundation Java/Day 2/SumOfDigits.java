/*
12. Sum of Digits
Given number = 345. Find the sum of its digits using / and % only.
Sum = 3 + 4 + 5 = 12


*/
public class SumOfDigits {
    public static void main(String [] args){
        int num = 345;
        int sum = 0;
        while(num!= 0){
            int digit = num %10;
            sum += digit;
            num = num /10;
            
        }
        System.out.println(sum);

    }
    
}
