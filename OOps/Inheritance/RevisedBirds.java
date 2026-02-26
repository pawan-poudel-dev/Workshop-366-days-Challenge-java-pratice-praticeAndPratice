public class RevisedBirds extends RevisedAves {
    public void eat(){
        System.out.println("Eat to live");

    }
    public static void main(String [] args){
        RevisedBirds  obj = new RevisedBirds ();
        obj.eat();
        obj.nature();
    }
    
}
