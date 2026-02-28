public class Person1 {
    Person1(){
        System.out.println("Person is created.");
    }
    
}
 class Teacher extends Person1{
    Teacher(){
        System.out.println("Teacher created.");
    }
    public static void main (String [] args){
        Teacher obj = new Teacher();
        
    }
    
 }
