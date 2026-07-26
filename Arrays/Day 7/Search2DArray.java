import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter 9 Numbers: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter Number to search :");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at Row " + i + "Column " + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Number not Found .");
        }
        sc.close();
    }

}
