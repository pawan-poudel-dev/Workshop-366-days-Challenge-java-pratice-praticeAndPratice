// create an abstract class 
  abstract class Language {
    //fields and methods 
    public void display(){// regular  Method 
        System.out.println("This is a java programming");
                        
    }
}
class Main extends Language{
    public static void main(String [] args){
         //create an object of the main
Main1 obj = new Main1();

// access method of abstract class 
// using onject of main class 
obj.display();
    }

}