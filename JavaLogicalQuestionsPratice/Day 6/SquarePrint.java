class SquarePrint {
    public static void main(String[] args) {
        // printing the square of stars 5 *5
        // using for nested loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}