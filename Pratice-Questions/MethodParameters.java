public class MethodParameters {
    public void display1(){
        System.out.println("Methods Without parameters");

    }
    //  methods with single parameters 
    public void display2(int a){
        System.out.println("Methods With a single parameters:");
    }
    public static void main(String [] args){
        // create a object first 
        MethodParameters obj = new MethodParameters();
        // calling parameters with no parameters 
        obj.display1();
        obj.display2(4);
    }
    
}
