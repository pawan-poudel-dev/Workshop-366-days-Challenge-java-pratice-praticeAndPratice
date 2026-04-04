public class ReverseNumber {
    public static void main(String[] args) {
        int num = 56789;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;              // get the last digit 
            reverse = reverse * 10 + digit;    // Build the reverse by  multiplying and adding 
            num = num / 10;                    //extract or remove the  last digit   
        }

        System.out.println("Reverse of the number is: " + reverse);
    }
}