class CheckOddEven {
    public static void main(String[] args) {
        int num = 24;
        String[] arr = {"Even Number", "Odd Number"};
        System.out.println(arr[num & 1]);
    }
}