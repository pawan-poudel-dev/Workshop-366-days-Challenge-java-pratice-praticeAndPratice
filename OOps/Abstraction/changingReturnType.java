public class changingReturnType {
    // this method accepts int
    private static void display(int a){
        System.out.println("Got integer data");
    }
    // this method accepts string object 
    private static void display(String a){
        System.out.println("Got string object");
        
    }
    public static void main(String args []){
        display(1);
        display("Hello");

    }
    
}
