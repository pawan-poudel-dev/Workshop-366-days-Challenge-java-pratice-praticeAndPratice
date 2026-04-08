public class Animal {
    public void move(){
        System.out.println("Animals can Move.");
    }
    
}
 class Dog extends Animal{
    public void move(){
        super.move();// invokes the super class method 
        System.out.println("Dogs can  walk and run");

    }


}
class TestDog{
    public static void main(String [] args ){
        Animal b = new Dog();// Animal reference but  dog object 
        b.move();
    }
}