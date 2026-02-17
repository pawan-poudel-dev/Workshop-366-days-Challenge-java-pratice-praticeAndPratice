
//calculate the area and perimeter of a circle with radius 7
public class AreaAndPerimeterOfCircle {
    double area;
    double perimeter;
    int r = 7;
public void calculation(){
    System.out.println("The area and perimeter of the circle is: " + area +  " and  "+ perimeter);

}
public static void main(String [] args){
 AreaAndPerimeterOfCircle obj = new AreaAndPerimeterOfCircle();
 obj.area = Math.PI *obj.r *obj.r;
    obj.perimeter = 2 * Math.PI * obj.r;
obj.calculation();
 
 

}
    
}
