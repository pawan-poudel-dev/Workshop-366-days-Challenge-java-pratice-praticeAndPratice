public class RevisedParrot extends RevisedBirds{
    public void food(){
        System.out.println("Parrots eats seeds and fruits");

    }
    public static void main(String [] args){
        RevisedParrot p1 =  new RevisedParrot();
        p1.food();
        p1.nature();
        p1.eat();
    }
    
}
