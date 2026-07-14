public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 256;
        int b = 789;
        float c = 789.08f;

        // Type casting
        int d = (int) c;
        System.out.println(d);

        int addition = a + b + d; // Adds three numbers
        int substraction = b - a; // Subtracts the smaller number from the larger number
        int multiplication = a * b; // Multiplies two numbers
        int division = b / a; // Integer division
        int remainderOrFloorDivision = b % a; // Gets the remainder

        System.out.println(
                "The arithmetic operations from the numbers are:"
                        + "\nAddition: " + addition
                        + "\nSubstraction: " + substraction
                        + "\nMultiplication: " + multiplication
                        + "\nDivision: " + division
                        + "\nRemainder: " + remainderOrFloorDivision);
    }
}