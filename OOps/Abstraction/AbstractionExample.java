public abstract class  AbstractionExample{

     public void display(){
        System.out.println("This ia a java prgramming");
     }
}
 class Main extends AbstractionExample{
    public static void main  (String [] args){
        // create an object of main
        Main obj = new Main();
        // access method of abstract class
        // using object of main  class
        obj.display();
    }

 }