public class MethodParameters {
    //method with no paramters 
    public void display1(){
        System.out.println("Method with no parameters.");
    }
    public void display2(int a){
        System.out.println("Method with a single parameters: " + a);

    }
    public static void main(String [] args){
        //create a method of the methodParametersa
        MethodParameters obj = new MethodParameters();
        obj.display1();
        obj.display2(21);
    }
    
}
