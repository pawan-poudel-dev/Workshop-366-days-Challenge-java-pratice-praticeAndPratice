
public class Car1 {
    /* Create a class Car with:
variable: speed
method: showSpeed()
Set speed using object and print it.
     */
    int speed;
    public void showSpeed(){
      System.out.println("The speed of the car is " + speed+ "km/hr"); 

    }
    
    
    public static void main(String [] args){
    Car1  obj = new Car1();
    obj.speed = 60;//setting value using object 
    obj.showSpeed();//method call
    
  
    
}
}