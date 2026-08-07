public class CheckEvenOrOdd {

    public static void checkEvenOrOdd(int n) {

        if (n % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }
    }

    public static void main(String[] args) {

        checkEvenOrOdd(10);
        checkEvenOrOdd(7);
    }
}