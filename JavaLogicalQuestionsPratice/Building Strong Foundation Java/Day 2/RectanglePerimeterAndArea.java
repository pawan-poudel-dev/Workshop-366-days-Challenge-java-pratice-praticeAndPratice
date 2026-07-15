/*
Write a program to calculate the area and perimeter of a rectangle given length and width as double literals. Print both results.


*/
class RectanglePerimeterAndArea {
    public static void main(String[] args) {
        double length = 10;
        double width = 6;
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println(
                "The area of the rectgangle is: " + area + "\nThe perimeter of the Rectangle is: " + perimeter);

    }

}