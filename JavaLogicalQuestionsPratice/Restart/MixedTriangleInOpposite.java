public class MixedTriangleInOpposite {
    public static void main(String[] args) {
        int i, j, k, l, m, n;

        // 1. Upper Triangle (Grows to the right)
        for (i = 0; i <= 5; i++) {
            // Print leading spaces (decreasing from 5 down to 0)
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars (increasing from 1 to 6)
            for (k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Lower Triangle (Shrinks back to the right)
        for (l = 1; l <= 5; l++) {
            // Print leading spaces (increasing from 1 up to 5)
            for (m = 1; m <= l; m++) {
                System.out.print(" ");
            }
            // Print stars (decreasing from 5 down to 1)
            for (n = 5; n >= l; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
