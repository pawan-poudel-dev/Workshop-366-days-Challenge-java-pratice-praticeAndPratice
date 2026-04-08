public class Car {
    private String name = "BMw";
    private int price = 900000;// private attributes 
// getters : convection 
// public return type 
public String getName(){
return this.name;

}
public int getPrice(){
    return this.price;
}
}
class Main{
    public static void main(String [] args){
        Car c = new Car();
 c.getPrice();
 c.getName();
    }
}