public class MethodsExample2 {
    public static int  square(int num){
        // return 
        return num *num;

    }
    public static void main(String [] args){
        int result;
        // call the method 
        // stored returned to result 
        result = square(10);
        System.out.println("Squared value of the 10 is : "+ result);
    }
}
