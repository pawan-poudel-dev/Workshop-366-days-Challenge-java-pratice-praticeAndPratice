public class Shape {
    public void display(){
        System.out.println("Display Shape!!!");
    }
    
}
class Square extends Shape{
    @Override 
    public void display(){
        super.display();
        System.out.println("DIsplay Square....");
    }
}
class MainClass{
    public static void main(String [] args){
        Shape mySquare = new Square();
        mySquare.display();

    }
}
