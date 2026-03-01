 interface Polygon {
    void getArea(int length , int breadth);

    
}
// implement the polygon interface 
class Rectangle implements Polygon{
    // implementation of the abstract method
    public void getArea(int length , int breadth){
        System.out.println("The area of the rectangle is:" + (length *breadth));
    }
}
