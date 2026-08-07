public class Print1toN {

    public static void naturalNumber(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Natural numbers:");

        naturalNumber(20);
    }
}