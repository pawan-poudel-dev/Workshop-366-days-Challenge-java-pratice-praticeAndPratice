
/*
 Circle Area & Circumference
Declare radius = 6.0. Use Math.PI and print the area and circumference of the circle.

*/

public class AreaAndCircumference {
    public static void main(String[] args) {
        double radius = 6.0;
        double area = Math.PI * (radius * radius);
        double circumference = (2 * Math.PI * radius);
        System.out.println("Area :" + area);
        System.out.println("Circumference :" + circumference);

    }

}
