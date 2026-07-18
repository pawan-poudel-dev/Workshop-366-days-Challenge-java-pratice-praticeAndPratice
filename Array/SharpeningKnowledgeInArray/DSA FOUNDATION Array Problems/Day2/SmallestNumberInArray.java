public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = { 23, 4, 5, 34, 78, 1, 98, 0, 45, 3, 2 };
        int smallest = numbers[0];
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }

        }
        System.out.println(smallest);
    }
}