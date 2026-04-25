public class SwapVariable {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        // Before swapping
        System.out.println("Before swap: x = " + x + ", y = " + y);

        // Swapping using third variable
        int temp = x;
        x = y;
        y = temp;

        // After swapping   
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}