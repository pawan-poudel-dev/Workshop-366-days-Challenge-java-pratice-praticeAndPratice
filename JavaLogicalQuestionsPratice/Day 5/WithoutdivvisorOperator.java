public class WithoutdivvisorOperator {
    public static void main(String [] args){
        // find the quotient without /operator
        int dividend = 820;
         int divisor = 20;
         int quotient = 0;
         while(dividend >= divisor){
             dividend = dividend - divisor;// substract repetatedly
             quotient++;//count each times when it substract from dividend

         }
         System.out.println(quotient);
    }
}
