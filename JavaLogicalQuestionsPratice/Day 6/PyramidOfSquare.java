public class PyramidOfSquare {
    public static void main(String[] args) {

        int i, j, k;

        for (i = 1; i <= 6; i++) {

            // print spaces
            for (j = 6; j > i; j--) {
                System.out.print(" ");
            }

            // print stars
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }
    }
}