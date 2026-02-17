public class VariableTypes {
    public void showMessage(){
        System.out.println("Hello dear!");
    }
    public static void showStaticMessage(){
        System.out.println("This is a static method example.");
    }
    public static void main(String [] args){
        VariableTypes  obj = new VariableTypes();
        obj.showMessage();
        VariableTypes.showStaticMessage();//call static method using class name
        
    }
    
}
