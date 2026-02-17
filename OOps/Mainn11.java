public class Mainn11 {
   //create a method 
   public int addNumbers(int a,int b,int c){
    int sum = a + b +c;
    //return value
    return sum;

   } 
   public static void main(String [] args){
    int num1 = 34;
    int num2 = 34;
    int num3= 45;
    //create an objecct of main 
    Mainn11 obj = new Mainn11();
    int result = obj.addNumbers(num1,num2,num3);
     System.out.println("The output of the following expression is: " + result);

   }
    
}
