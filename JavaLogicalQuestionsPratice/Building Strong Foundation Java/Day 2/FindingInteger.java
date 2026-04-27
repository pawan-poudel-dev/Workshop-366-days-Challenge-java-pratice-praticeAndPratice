/*

Positive or Negative
Declare number = -15. Check if it is positive, negative, or zero and print accordingly.
 */
public class FindingInteger {
    public static void main(String [] args){
        int num = -15;
        if(num < 0){
            System.out.println("Number is Negative");
        }
        else if(num >0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Number is 0");
        }
    }
}
