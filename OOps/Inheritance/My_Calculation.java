public class My_Calculation extends Calculation{
    public void multiplication(int x , int y){
        z = x*y;
        System.out.println("The multiplivcation of the number is :" + z);

    }
    public static void main(String [] args){
        int a =2 ; int b = 34;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.substraction(a, b);
        demo.multiplication(a, b);
    }
}