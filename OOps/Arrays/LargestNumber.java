//Use a ternary operator to find the largest of two numbers.
public class LargestNumber {
    public static void main(String [] args){
        int num1 = 80;//declearing the integer  as num1
        int num2 = 90;//declearing the integer as num2
        String largest = (num1 > num2)?" num1 is  Largest":"Num2 is largest";
        System.out.println("The largest between two numbers is :" + largest);
    }
    
}
