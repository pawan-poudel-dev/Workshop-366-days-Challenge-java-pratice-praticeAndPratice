abstract  class AbstractionExample {
    // method of abstract class 
    //concrete method 
    public  void display() {
        System.out.println("This is a java programming");
        
    }

    
}
class Main extends AbstractionExample{
    public static void main(String [] args){
        // create  an objject of main
        Main obj = new Main();
        // access the method of abstract class
        // using object of main class 
        obj.display();
    }

}
