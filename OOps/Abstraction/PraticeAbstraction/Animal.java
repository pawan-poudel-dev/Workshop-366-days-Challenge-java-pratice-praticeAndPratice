// example of abstraction through abstract method 
abstract class Animal {
    // abstract method 
    abstract void makeSound();
    // regular method 
    public void eat(){
        System.out.println("Pawan eats food.But,pawan  is not a animal.");

    }
    
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dogs barks");
    }
}
class Maintain{
    public static void main(String [ ] args){
// create the object of Dog class
Dog d1 = new Dog();
d1.makeSound();
d1.eat();
    }
}