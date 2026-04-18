public class SumOfDigits {
    public static void main(String [] args){
        // finding the sum of the digit
        int sum = 0;
        int digit;
        int n =  2345678;
// use while loop until number becomes greater than 0
        while(n!= 0){
            digit = n %10;// gets the last digit
            sum = sum + digit;// it adds the digit to sum
            n = n/10;// removes the last digit

        }
        System.out.println(sum);
    }
}
