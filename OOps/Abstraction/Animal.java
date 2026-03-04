public  abstract class Animal {
    // using the abstract method , remembering that abstract method  dosent have the body 
    abstract void makeSound();
    // regular method
    public void eat(){
        System.out.println("I can eat");
    }
    
}
 class Dog extends  Animal{
    // provides iumplementation of abstract method
    public void makeSound(){
        System.out.println("Nark bark");
        }
    }
 class Test{
    public static void main(String [] args){
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
 }