public class CodeReusable {
    // method defined 
    private static int getSquare(int x){
        return x *x;

    }
    public static void main(String [] args){
        for(int i = 1; i <= 10; i ++){
            // calling the method inside the foor loop 
            int result = getSquare(i);
            System.out.println("Square of" + i + "is" + result);
        }
    }
    
}
