public class Example {
    //  here we are revised the concepts of the methods 
    public int addNumbers(int a , int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String [] args){
        int num1 = 56;
        int num2 = 45;
        // create an object of the Example 
        Example obj = new Example();
        // calling method
        int result = obj.addNumbers(num1 ,num2);
        System.out.println("Sum is :" + result);
    }
    
}
