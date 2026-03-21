public class Main {
    // create a method 
    public int addNumbers(int a, int b){
        int sum = a + b;
        // returning the sum 
        return sum;
    }
    public static void main(String [] args){
        int num1 = 12; 
        int num2 = 25;
        // create an object of main
        Main obj = new Main();
        // calling method
       int result =  obj.addNumbers(12,45);
         System.out.println("Sum is: " +result);
    }
}
