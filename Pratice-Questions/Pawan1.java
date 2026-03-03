 import java .util.Scanner;
 public  class Pawan1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");//check if a number  isspositive or negative 
    System.out.println("Enter your name :");
    String name = input.nextLine();
    
    if (name .equals("Pawan" )){
        System.out.println("You have entered a correct name" + name);
        
    }else{
        System.out.println("You have entered a wrong name, Pllease try again!!!!!!");
    }
    System.out.println(name.getClass().getSimpleName());
        
        
        
        
    }
}
