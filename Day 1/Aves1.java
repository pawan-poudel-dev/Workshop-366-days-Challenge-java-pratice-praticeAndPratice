// multi level inheritance 
public class Aves1 {
    public void nature(){
        System.out.println("Generally , Aves can fly");
    }
    
}
class Bird extends  Aves{
    public  void eat(){
        System.out.println("Eats to live");
    }
}
class Parrot extends Bird{
    public void food(){
        System.out.println("Parrots eats seeds and fruits ");
    }
    public static void main(String [] args){
        Parrot p1 = new Parrot();
        p1.food();// calling its own method 
        p1.eat();// calling super class eat methos 
        p1.nature();// calling its grand parent 
    }

}
