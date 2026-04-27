public class DigitExtractor {
    public static void main(String[] args) {
        int num = 497;

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Units: " + units);
    }
}
            

    