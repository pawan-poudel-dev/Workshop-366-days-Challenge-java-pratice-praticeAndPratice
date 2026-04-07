public class MethodsExample {
    // create a method
    public int addNumbers(int a, int b){
        int sum = a + b;
        // return sum 
        return sum;
    }
    public static void main(String [] args){
        int num1 = 25;
         int num2 = 34;
         // create a object od the MethodExample 
         MethodsExample  obj = new MethodsExample();
         // calling methd
         int result = obj.addNumbers(num1, num2);
         System.out.println("Sum is :" + result);
    }

    
}
