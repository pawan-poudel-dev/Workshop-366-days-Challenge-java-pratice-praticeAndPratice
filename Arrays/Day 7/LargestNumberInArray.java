import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        System.out.println("Entyer 16 Numbers :");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int largest = arr[0][0];
        System.out.println("Elements in Array are : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }

            }
        }
        System.out.println("Largest Number =" + largest);
        sc.close();

    }
}
