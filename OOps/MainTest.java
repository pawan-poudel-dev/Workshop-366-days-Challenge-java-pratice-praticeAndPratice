public class MainTest {

    //create a method
    public static int square( int num){
        return num * num;
    }
    public static void main(String [] args){
        int result;
        //call the method 
        //stored returned value to result
        result = square(5);
        System.out.println("Squared value of 5 is : " +  result);
    }
    
}
