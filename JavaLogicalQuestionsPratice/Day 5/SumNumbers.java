public class SumNumbers {
    public static void main(String [] args){
        // finding out the sum of numberrs from 1 to N
        // first using the mathematical formula
        // sum = n(n+1)/2 sum of natural numbers
         //int number = 100;
         // suing the formula
        //int sum = (number*(number +1))/2;
        //System.out.println("Sum of number is: " + sum);
        // usinng the another approach to encounter this problem
        int sum = 0;
        int i;
        for( i = 1; i<= 100; i++){
            sum += i;

        }
        System.out.println(sum);

    }
}
