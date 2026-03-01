class Main1{
    public static void main(String [] args){
    // create an object of the dog class because abstract methods only access throught  instance of subclass
    Dog dog = new Dog();
    dog.makeSound();
    dog.eat();
    }
  }
