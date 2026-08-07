public class SumExample {
    public void  addNumbers(int a , int b){
        System.out.println("The summation of the Int a and Int b is : "+ (a+b));

    }
    public static void main(String [] args){
        SumExample obj = new SumExample();// this is  class Object that we have created
        obj.addNumbers(1,2);
    }
}
