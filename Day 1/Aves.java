// example of aves or implermenting the example of the  inheritance 
// single type inheritance 
class  Aves{
    public void nature(){
        System.out.println("Generally , Aves fly");
    }

}
class Bird extends Aves{
    public void eat(){
        System.out.println("Eats to live");
    }
    public static void main(String [] args){
        Bird b1 = new Bird();
        b1.nature();// callig its own method 
        b1.eat();// calling its super class method 
    }
}