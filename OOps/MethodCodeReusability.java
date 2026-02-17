public class MethodCodeReusability {
    private static int getSquare(int x){
        return x *x;

    }
    public static void main(String [] args){
        for(int i = 0; i <= 5; i++){

        
        //method call
        int result = getSquare(5);
        System.out.println("Square of :" + i + "is" + result);
    }}
    
}
