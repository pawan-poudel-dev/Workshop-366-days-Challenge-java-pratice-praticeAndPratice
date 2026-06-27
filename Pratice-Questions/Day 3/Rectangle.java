import java.util.*;
public class Rectangle {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: ");
        int Length = sc.nextInt();
        System.out.println("Width: ");
        int width = sc.nextInt();
        int parameter = 2 *(Length +width);
        int area = Length *width;
        System.out.println("Area of rectangle is : "+ area);
        System.out.println("The parameter of the rectangle is : "+parameter);
        System.out.println();
        sc.close();
    }
}
