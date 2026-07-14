public class SwapVariables {
    public static void main(String[] args) {
        int a = 100;
        int b = 90;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a + "\nb: " + b);
    }
}