public class Shape {
    public void display(){
        System.out.println("Display shape.");
    }
    
}
class Square extends Shape{
    @Override
    public void display(){
        System.out.println("Display square.");
    }
}
 class MainTest{
    public static void main(String [] args){
        Square mySquare = new Square();
        
        Shape s1 = new Square();
        s1.display();
        
    }
 }
