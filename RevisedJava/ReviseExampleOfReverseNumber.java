public class ReviseExampleOfReverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        int num = 34567;
        while (num != 0) {
            int digit = num % 10;// gets the last digit
            rev = rev * 10 + digit; // here , the reverse Number is continue to formation
            num = num / 10; // removes the last digit
            

        }
        System.out.println(rev);
    }

}
