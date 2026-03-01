abstract class  Animal {
    abstract void makeSound();// no body implementation in abstract method
    public void eat(){
        System.out.println("I can eat");
    }
  
    
}
 class Dog extends Animal{
    //provide implementation of the abstract method from the super class 
     void makeSound(){
        System.out.println("Bark , Bark");

    }
 }
  