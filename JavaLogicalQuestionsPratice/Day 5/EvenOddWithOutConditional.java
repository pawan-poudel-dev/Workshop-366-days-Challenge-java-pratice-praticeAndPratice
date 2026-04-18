public class EvenOddWithOutConditional {
    public static void main(String [] args){
        // checking  if  the number is even odd without if/ else
        // simply we use ternary operator
        int num = 89;
        String check = (num %2 ==0)?"EVEN NUMBER" :"ODD NUMBER";
        System.out.println(check);
    }
}
