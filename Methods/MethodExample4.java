import java.util.Scanner;
public class MethodExample4 {
    static  void checkAge(int age){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter your age first:");
         age = sc.nextInt();
         if(age >=18){
            System.out.println("Access Granted-- u you are elligible to enter in the club.");

         }else{
            System.out.println("Access denied--- you are not old enouggh to enter in the  club.");
         }

    }
    public static void  main(String [] args){
     MethodExample4.checkAge(78);
    }
    
}
