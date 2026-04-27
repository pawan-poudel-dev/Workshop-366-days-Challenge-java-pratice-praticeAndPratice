/*
11. Reverse a 3-Digit Number
Given number = stalion836. Extract digits and reconstruct the reverse number mathematically.
Original: 836
Reversed: 638
*/

class Reverse3DigitNumber {
    public static void main(String[] args) {
        int number = 836;
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;// gets the last digit
            rev = rev * 10 + digit;// make the reverse order
            number = number / 10;// removers the last digit

        }
        System.out.println("Reverse is :" + rev);

    }
}