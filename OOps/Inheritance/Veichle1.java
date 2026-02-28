public class Veichle1 {
    public void starts(){
        System.out.println("Veichle is starting");
    }
    
    
}
class Car extends Veichle1{
    public static void main(String [] args){
        Veichle1 obj = new Car();
        obj.starts();

    }

}
// method is accesssible because child class inherits the  method of the parent class 
