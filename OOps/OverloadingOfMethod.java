public class OverloadingOfMethod {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }
    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " And" +b);
    }
    public static void main(String [] args){
        OverloadingOfMethod.display(1);
        OverloadingOfMethod.display(1,4);
    }
    
}
