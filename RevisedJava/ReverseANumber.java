public class ReverseANumber {
    public static void main(String[] args) {
        long rev = 0;
        long num = 778345;
        while (num != 0) {
            long digit =num % 10;// gets the last digit
            rev = rev * 10 + digit;// push and add a new number
            num = num / 10;

        }
        System.out.println("Reversed Number is :" + rev);

    }

}
