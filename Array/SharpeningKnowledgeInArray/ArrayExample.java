class ArrayExample {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 9, 1 };

        int sum = 0;
        int count = 0;

        // Step 1: calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Step 2: calculate average
        int average = sum / arr.length;

        // Step 3: count elements greater than average
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }

        System.out.println(count);
    }
}