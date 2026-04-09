// example of 
interface Polygon{
    void getArea(int length, int beadth);
}
// implements the polygon interface 
class Rectangle  implements Polygon{
    // implements the abstract method 
    public void getArea(int length , int breadth){
        System.out.println("Area  of the rectangle is:  " + (length *breadth));
    }

}
 class MainTest1{
    public static void main(String [] args){
        Rectangle r1  = new Rectangle();
        r1.getArea(12, 23);

    }
 }