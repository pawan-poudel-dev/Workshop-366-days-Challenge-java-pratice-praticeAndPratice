public class BreakExample {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                break;
            }
            System.out.println("Number :" + i);
        }
    }

}
