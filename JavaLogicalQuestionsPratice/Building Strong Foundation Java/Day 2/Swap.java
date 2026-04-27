/*
6. Swap Without Temp Variable
Declare a = 25 and b = 75. Swap them without using any third variable. (Use math operators only)


*/

public class Swap {
    public static void main(String[] args) {
        int a = 25;
        int b = 75;
        System.out.println("Before Swap : " + "a : " + a + " b :" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap : " + "a : " + a + " b : " + b);

    }

}
