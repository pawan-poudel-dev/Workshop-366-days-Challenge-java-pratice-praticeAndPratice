// demonstrates the example of the multilevel inheritence 
public class Aves1 {
    public void  nature(){
        System.out.println("Generally , aves can fly");
    }
    
    
}
class Bird1 extends Aves1{
    public void eat(){
        System.out.println("Eats to live");
    }
}
class Parrot extends Bird{
    public void food(){
        System.out.println("PARROT EATS SEEDs and fruits");
    }
    public static void main(String [] args){
    Parrot p1 = new Parrot();
        p1.food();
        p1.eat();// calling super class Bird method 
        p1.nature();//calling super class Aves method 

    }
}