class Polygon{
    // method render to s shape 
    public void render(){
        System.out.println("Rendering polygon...");
    }
}
class Square extends Polygon{
    // renders square 
    @Override
    public void render(){
        System.out.println("Rendering square ....");
    }
}
class Circle extends Polygon{
    // renders circle
     public void render(){
        System.out.println("Rendering circle .....");
     }
}
class Main{
    public static void main(String [] args){
        // create an object of square 
        Square s1 = new Square();
        s1.render();
        // create an object of circle 
        Circle c1 = new Circle();
        c1.render();
        Polygon c2 = new Polygon();
        c2.render();
    }
}