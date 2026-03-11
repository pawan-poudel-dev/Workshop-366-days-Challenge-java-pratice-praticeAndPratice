//product of numbers from 1 to n
public class ProductOfNumber {
    public static void main(String [] args){
        int product=1;
        for(int i= 1;i<= 5;i++){
            product *= i;
        }
        System.out.println("Now, the product of the  number is:"+ product);
    }
}
