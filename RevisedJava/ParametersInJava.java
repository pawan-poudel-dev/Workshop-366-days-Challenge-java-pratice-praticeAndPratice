public class ParametersInJava {
    // method with no param
    public void display(){
        System.out.println("Method without parameters.");

    }
    // method with sigle parameters 
    public void display2(int a){
        System.out.println("This is a method with single parameters :" + a);

    }
    public static void main(String [] args){
        ParametersInJava obj = new ParametersInJava();
        obj.display();
        obj.display2(23);

    }
    
}
