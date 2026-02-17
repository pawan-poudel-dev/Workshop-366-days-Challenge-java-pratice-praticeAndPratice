public class ArithmeticOperationsInOops {
    //decleration of the method 
    public int  arithmeticNumbers(int a,int b, int c, int d){
        int sum = a + b + c + d;//sum of the parameters inside the method
        return sum;
        

    }
    public static void main(String [] args){
        int num1 = 78;
        int num2 = 56;
        int num3  = 45;
        int num4 = 758;
        ArithmeticOperationsInOops obj = new ArithmeticOperationsInOops();
        //method calling 
        int output = obj.arithmeticNumbers(num1,num2,num3,num4);
        System.out.println("The output of the following code is: " + output);

    }
    
    
}
