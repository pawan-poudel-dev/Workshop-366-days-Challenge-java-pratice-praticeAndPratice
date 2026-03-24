public class Animal {
    public void move(){
        System.out.println("Animals can move.");
    }
    
}
 class Dog extends Animal{
public void move(){
super.move();// invokes thr super class method
    System.out.println("Dogs can walk and run.");
}

}
class TestDog{
    public static void main(String [] args){
        Animal b = new Dog();// animal reference but dog object 
        b.move();// runs the method in dog class 
    }
}