// this is a multi line inheritence 
public class Parrot extends Bird {
    public void food(){
        System.out.println("parrot eats seeds and fruits");
    }
    public static void main (String [] args){
        Parrot p1 = new Parrot();
        p1.food();
        p1.eat();
        p1.nature();
    }
    
}
