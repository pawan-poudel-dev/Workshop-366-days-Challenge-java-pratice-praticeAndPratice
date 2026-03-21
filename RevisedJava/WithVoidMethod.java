public class WithVoidMethod {
    void square(int a){
        int square = a *a;  
        System.out.println("Square is : " + square);
    
    
    
    }
    public static void main(String [] args){
        WithVoidMethod obj = new WithVoidMethod();
        obj.square(12);
        
    }
    
}
