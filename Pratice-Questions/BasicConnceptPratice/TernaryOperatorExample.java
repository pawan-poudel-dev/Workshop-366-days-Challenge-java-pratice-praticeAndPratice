/*
Using only the ternary operator (no if-else), print whether a given number is positive, negative, or zero. (Hint: you may need to nest two ternary operators.)


 */

public class TernaryOperatorExample {
    public static void main(String [] args){
        int  num = 0;
        String result = num > 0?"Positive Number":num <0 ?"Negativ Number": "Zero";
System.out.println(result);
    }
}
