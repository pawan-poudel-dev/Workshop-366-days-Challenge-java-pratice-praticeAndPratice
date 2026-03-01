public class Bokk {
    String name;
    double price;
    // example of the parameterized constructor 
    Bokk(String name,  double price){
        this.name = name;
         this.price= price;
         System.out.println("Name of Book is: "+this.name);
         System.out.println("Price of book is: "+ this.price);

    }
    public static void main(String args[]){
        // calling  the constructors 
        Bokk obj = new Bokk("java",4994.987);
        Bokk obj1  = new Bokk("python", 8493);
        

    }
    
}
