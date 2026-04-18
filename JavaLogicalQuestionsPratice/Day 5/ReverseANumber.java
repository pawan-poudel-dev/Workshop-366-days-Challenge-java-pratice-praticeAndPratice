public class ReverseANumber {
    public static void main(String [] args){
        // reversing  the number(1234 - 4321)

int num = 123456;
int rev = 0;
// using  while loop
        while(num != 0){
            int digit = num%10;//gets last digit
            rev = rev *10 + digit;// builds reverse pattern
            num = num/10;// removes the last digit

        }
        System.out.println(rev);
    }
}
