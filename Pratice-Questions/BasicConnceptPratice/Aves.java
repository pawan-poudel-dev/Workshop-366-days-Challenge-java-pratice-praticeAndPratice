public class Aves {
    public void nature(){
        System.out.println(" Generally, Aves Fly");
    }
    
}
class Bird extends Aves{
    public void eat(){
        System.out.println("Eats to live");

    }
    public static void main(String [] args){
        Bird b1 = new Bird();
        b1.eat();
        b1.nature();
    }
}