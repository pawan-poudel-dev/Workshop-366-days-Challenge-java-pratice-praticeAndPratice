public class Reversnumbers {
    public static void main(String [] args){
         int num = 112345566;
        int  reverse_Number= 0;
        while(num != 0){
            int digit = num % 10;
            reverse_Number = reverse_Number + digit;
            num /=2;
        }
        System.out.println(reverse_Number);

    }
    
}
/*

digit = number % 10 — peeks at the last digit using the modulo operator
rev_num = rev_num * 10 + digit — shifts rev_num left by one place, then appends the digit
number /= 10 — chops off the last digit (integer division)
So 12345 becomes 5, then 54, then 543, then 5432, then 54321 — one digit at a time, in reverse order.








*/