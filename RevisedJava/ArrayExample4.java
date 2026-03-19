import java.util.Scanner;
public class ArrayExample4 {
    public static void main(String [] args){
        int numbers[]= new int[5];
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter input 5 numbers:");
        for(int i =0;i< numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        numbers[0]= 10;
        numbers[2]= 20;

  System.out.println("Thank u much much!!!!");
    }
    
}
