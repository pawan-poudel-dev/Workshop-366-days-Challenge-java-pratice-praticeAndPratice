/*
 Distance Between Two Points
Declare x1=3.0, y1=4.0, x2=7.0, y2=1.0. Calculate and print the Euclidean distance.
Formula: d = √((x2-x1)² + (y2-y1)²)
Use Math.sqrt() and Math.pow().


*/
public class DistanceBetween {
    public static void main(String [] args){
        // local variables
        double x1 = 3.0;
        double y1 = 4.0;
        double x2 = 7.0;
        double y2 = 1.0;
        double d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Distance is : " + d);
    }
    
}
