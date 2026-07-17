public class ReverseNumber1 {
    public static void main(String[] args) {
        int rev = 0;
        int num = 8974;
        while (num != 0) {
            int digit = num % 10;// gets the last digit
            rev = rev * 10 + digit;// reverse Formation
            num = num / 10;// eliminates the last digit
        }
        System.out.println(rev);
    }

}
