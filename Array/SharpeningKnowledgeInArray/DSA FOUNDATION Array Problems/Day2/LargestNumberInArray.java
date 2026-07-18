public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = { 12, 23, 45, 67, 9, 6, 89, 1, 2, 3, 0 };
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }

        }
        System.out.println(largest);
    }

}
