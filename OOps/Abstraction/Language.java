// create an abstract class 
  abstract class Language {
    //fields and methods 
    public void display(){// abstract Method 
        System.out.println("This is a java programming");
                        
    }
}
class Main extends Language{
    public static void main(String [] args){
         //create an object of the main
Main obj = new Main();

// access method of abstract class 
// using onject of main class 
obj.display();
    }

}