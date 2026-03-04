public abstract class  AbstractionExample1{

     public void display(){
        System.out.println("This ia a java prgramming");
     }
}
 class Type extends AbstractionExample1{
    public static void main  (String [] args){
        // create an object of main
        Type obj = new Type();
        // access method of abstract class
        // using object of main  class
        obj.display();
    }

 }