public class Calculator {
    double calculateArea( double radius ){


        return 3.14 * radius *radius;
}
public static void main(String [] args){
        Calculator calc = new Calculator();
        double area = calc.calculateArea( 5 );
        System.out.println( "Area is " + area );

}




}
