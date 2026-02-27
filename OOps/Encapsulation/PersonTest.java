public class PersonTest {
    public static void main(String [] args){
        Person obj = new Person();
        obj.setAge(150);
        obj.setAge(-5);
        obj.setAge(25);
        System.out.println("The age is:" + obj.getAge());

    }
    
}
