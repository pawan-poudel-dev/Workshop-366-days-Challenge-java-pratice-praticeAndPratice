public class PercentageExample {

    public static double percentageCalculation(double obtained, double total) {
        return (obtained / total) * 100;
    }

    public static void main(String[] args) {

        System.out.println(
                "The total percentage obtained by the student is: "
                        + percentageCalculation(400.00, 700.00)
                        + "%"
        );
    }
}