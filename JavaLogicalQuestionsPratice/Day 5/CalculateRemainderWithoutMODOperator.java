public class CalculateRemainderWithoutMODOperator {
    public static void main(String [] args){
        // finding the remainder without modulo operator
        // using the mathematical formula
        // remainder = dividend -(divisor *quotient)
        // Now, Executing this in code
        int dividend = 820;
        int divisor = 20;
        int quotient = dividend /divisor;
        int remainder = dividend -(divisor *quotient);
        System.out.println(remainder);

    }
}
