/*Check if a number is three-digit,
 and if yes, check if it's even. */
import java.util.Scanner;//taking scanner to get the input from the keyboard
public class NumberCheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);//input from the keyboard 
        System.out.println("Enter a number: ");
        int number = sc.nextInt();//taking the input from the keyboard
        //Starting of the nested if 
        if(number >100 && number < 999){
            System.out.println("The number you have entered is " + number + "  is Three digit number");//number is greater than 99 and less than 999 then it\'s a three digit number'
       
       if(number % 2 == 0){
        System.out.println("The given nbumber is even number.");//if divide by 2 even
       }else{
        System.out.println("The number is not divisible by 2 so that its a odd number.");//if the number is not divide by 2 then its a odd number.


       }
       
       
       
       
        }else{
            System.out.println("The given number is not a  three digit number.");// if number is less than 100 and greater than 1000 then its not belong in the category of 3 digit number \

        }}}




        
    

    

