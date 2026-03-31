public class MethodExample3 {
    // create a check age() method with an integer variable  called age 
    static void checkAge(int age){
        //if age is less than 18, print "access  denied"
        if(age <18){
            System.out.println("Access denied!! you are not old enough!!");
            // if age is greaye than or equal to  18 , print access granted.

        }else{
            System.out.println("Access granted-- you are old enough!");
        }
    }
     public static void main(String [] args){
        checkAge(20);
     }
}
