/*
No parameter, return value

Create a method getAge() that returns 20.
 */
public class AgeInClasses {
    public int getAge(){
        return 20;
    }
    public static void main(String [] args){
       AgeInClasses obj = new AgeInClasses();
       int age = obj.getAge();
       System.out.println("The age of the person is: " + age);

    }

    
}
