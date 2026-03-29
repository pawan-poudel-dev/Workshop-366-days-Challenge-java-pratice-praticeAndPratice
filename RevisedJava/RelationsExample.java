import java.util.*;

public class RelationsExample {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};

        List<String> R1 = new ArrayList<>();
        List<String> R2 = new ArrayList<>();
        List<String> R3 = new ArrayList<>();
        List<String> R4 = new ArrayList<>();

        for (int x : A) {
            for (int y : A) {

                // R1: x > y
                if (x > y) {
                    R1.add("(" + x + "," + y + ")");
                }

                // R2: x + y is even
                if ((x + y) % 2 == 0) {
                    R2.add("(" + x + "," + y + ")");
                }

                // R3: y divisible by x
                if (y % x == 0) {
                    R3.add("(" + x + "," + y + ")");
                }

                // R4: (x - y) divisible by 3
                if ((x - y) % 3 == 0) {
                    R4.add("(" + x + "," + y + ")");
                }
            }
        }

        // Print results
        System.out.println("R1 (x > y): " + R1);
        System.out.println("R2 (x + y even): " + R2);
        System.out.println("R3 (y divisible by x): " + R3);
        System.out.println("R4 (x - y divisible by 3): " + R4);
    }
}