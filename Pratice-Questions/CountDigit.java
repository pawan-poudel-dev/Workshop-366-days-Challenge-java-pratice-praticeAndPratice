public class CountDigit {
    public static void main(String[] args) {
        int number = 351457;
        int count = 0;

        System.out.println("Number: " + number);

        while (number != 0) {
            number /= 10;  // remove last digit
            count++;       // count it
        }
        System.out.println("Total digits: " + count);
    }
}