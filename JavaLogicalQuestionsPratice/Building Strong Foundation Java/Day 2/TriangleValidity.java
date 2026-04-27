/*
Triangle Validity
Declare three sides a = 5, b = 9, c = 3. A triangle is valid only if sum of any two sides is greater than the third side. Print "Valid Triangle" or "Invalid Triangle".


 */


public class TriangleValidity {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 3;

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}