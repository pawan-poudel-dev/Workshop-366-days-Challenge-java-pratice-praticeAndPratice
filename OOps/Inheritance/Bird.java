// single line inheritence   which inherits  properties from super class/ parent classs 
class Bird  extends Aves{
    public void eat(){
        System.out.println("Eats to  live");
    }
    public static void main(String [] args){
        Bird b1 = new Bird();
        b1.eat();// calling its  own method
        b1.nature();//calling super class  method
    }
    
}
